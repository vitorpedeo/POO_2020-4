package aula12.as10b.ex02;

import java.util.ArrayList;
import java.util.List;

/*
 Exercício 2
*/

public class Pasta {

    private String nome;
    private String nomeDiretorio = "***";
    private List <Pasta> subpastas;
    private List <Arquivo> arquivos;

    public Pasta(String nome) {
        this.nome = nome;
        subpastas = new ArrayList<Pasta>();
        arquivos = new ArrayList<Arquivo>();
    }

    public void setNomeDiretorio(String nomeDiretorio) {
        this.nomeDiretorio = nomeDiretorio;
    }

    public String getNomeDiretorio() {
        return nomeDiretorio;
    }

    public String getNome() {
        return nome;
    }

    public List<Pasta> getSubpastas() {
        return subpastas;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void adicionarSubpasta(Pasta subpasta) {
        this.subpastas.add(subpasta);
        subpasta.setNomeDiretorio(this.getNome());

    }

    public void removerSubpasta(Pasta subpasta) {
        this.subpastas.remove(subpasta);
    }

    public void adicionarArquivo(Arquivo arquivo) {
        this.arquivos.add(arquivo);
        arquivo.setNomeDiretorio(this.getNome());
    }

    public void removerArquivo(Arquivo arquivo) {
        this.arquivos.remove(arquivo);
    }

    public void mostrar() {
        System.out.println("Nome da Pasta: " + this.nome + " - Pasta Acima: " + this.getNomeDiretorio());

        for (Pasta p : this.getSubpastas()) {
            p.mostrar();
        }

        for (Arquivo a : this.getArquivos()) {
            System.out.println(a);
        }
    }
}
