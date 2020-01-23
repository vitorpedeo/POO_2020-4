package aula04.as4b.ex01.contexto2;

public class Departamento {

    private String nome;
    private String sigla;

    public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String toString() {
        return String.format("\nNome do Departamento: %s\nSigla do Departamento: %s\n", this.getNome(),
                this.getSigla());
    }

}