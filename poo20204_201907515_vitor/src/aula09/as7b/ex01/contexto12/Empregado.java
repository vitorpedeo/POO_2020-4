package aula09.as7b.ex01.contexto12;

/*
  Exercício 1
*/

public class Empregado implements Modelo {

    private String codigo;
    private String nome;
    private int idade;

    public Empregado(String codigo, String nome, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return String.format(
                "\nTítulo do Projeto: %s\nNome do Empregado: %s\nCódigo do Empregado: %s\nIdade do Empregado: %d\n",
                TITULO_DO_PROJETO, this.getNome(), this.getCodigo(), this.getIdade());
    }

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Dados do Empregado: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("------------------------");
    }

}