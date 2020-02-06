package aula12.as10b.ex02;

/*
 Exercício 2
*/

public class Arquivo {

    private String nome;
    private long tamanho;
    private String nomeDiretorio;

    public Arquivo(String nome, long tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTamanho() {
        return tamanho;
    }

    public void setTamanho(long tamanho) {
        this.tamanho = tamanho;
    }

    public String getNomeDiretorio() {
        return nomeDiretorio;
    }

    public void setNomeDiretorio(String nomeDiretorio) {
        this.nomeDiretorio = nomeDiretorio;
    }

    public String toString() {
        return "Nome do Arquivo: " + this.nome + " - Tamanho: " + this.tamanho + "Kb" + " - Pasta: " + this.nomeDiretorio;
    }
}
