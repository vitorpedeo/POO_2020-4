package aula04.as4b.ex01.contexto1;

/*
  Exercício 1
*/

public class Compositor {

    private String nome;
    private String nacionalidade;

    public Compositor (String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return String.format("Compositor(es): %s\nNacionalidade: %s\n", this.getNome(), this.getNacionalidade());
    }
}