package aula09.as7b.ex01.contexto11;

/*
  Exercício 1
*/

public abstract class Modelo {

    private String tituloDoProjeto;

    Modelo(String tituloDoProjeto) {
        this.tituloDoProjeto = tituloDoProjeto;
    }

    public String getTituloDoProjeto() {
        return tituloDoProjeto;
    }

    public void setTituloDoProjeto(String tituloDoProjeto) {
        this.tituloDoProjeto = tituloDoProjeto;
    }

    public abstract void imprimir();

    public String toString() {
        return String.format("\nTitulo do Projeto: %s\n", this.getTituloDoProjeto());
    }

}