package aula04.as4b.ex01.contexto1;

/*
  Exercício 1
*/

public class Musica {

    private String nome;
    private String tipo;
    private int ano;
    private Compositor compositor;

    public Musica(String nome, String tipo, int ano, Compositor compositor) {
        this.nome = nome;
        this.tipo = tipo;
        this.ano = ano;
        this.compositor = compositor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Compositor getCompositor() {
        return compositor;
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    public String toString() {
        return String.format("\nNome da Música: %s\nTipo: %s\nAno de Lançamento: %d\n", this.getNome(), this.getTipo(),
                this.getAno()) + this.getCompositor().toString();
    }
}