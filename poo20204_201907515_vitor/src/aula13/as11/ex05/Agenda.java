package aula13.as11.ex05;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/*
  Exercício 5
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
        RandomAccessFile raf = new RandomAccessFile(System.getProperty("user.dir") + "//src//arquivos_as11//AgendaRAF.txt","rw");
        DecimalFormat df = new DecimalFormat("#,###.00");

        for (Pessoa p : this.getContatos()) {
            String linha = p.getNome() + " " + p.getIdade() + " " + df.format(p.getAltura()/100) + "\n";
            raf.write(linha.getBytes());
        }

        raf.close();
    }


}