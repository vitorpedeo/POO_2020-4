package aula13.as11.ex01;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/*
  Exercício 1
*/

public class Agenda {

    private List<Pessoa> contatos = new ArrayList<Pessoa>();

    public List<Pessoa> getContatos() {
        return contatos;
    }

    public void setContatos(List<Pessoa> contatos) {
        this.contatos = contatos;
    }

    public void armazenaPessoa(String nome, int idade, double altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        contatos.add(pessoa);
    }

    public void mostraAgenda() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        for (Pessoa p : this.getContatos()) {
            System.out.println("NOME: " + p.getNome());
            System.out.println("IDADE: " + p.getIdade() + " anos");
            System.out.println("ALTURA: " + df.format(p.getAltura()) + "m\n");
        }
    }

    public void gravaEmArquivo() throws IOException {
        OutputStream os = new FileOutputStream(System.getProperty("user.dir") + "//src//arquivos_as11//Agenda.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bf = new BufferedWriter(osw);
        DecimalFormat df = new DecimalFormat("#,###.00");

        for (Pessoa p : this.getContatos()) {
            bf.write( p.getNome() + " " + p.getIdade() + " " + df.format(p.getAltura()/100) + "\n");
        }

        bf.close();
    }


}