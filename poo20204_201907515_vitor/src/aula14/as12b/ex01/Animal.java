package aula14.as12b.ex01;

/*
 Exercício 1
*/

/* Mesma classe relativa a Lista AS8b,
 * copiada a este diretório para facilitar
 * os testes
 */

public abstract class Animal {

    private String nome;
    private int idade;

    public Animal() {

    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    public abstract String emitirSom();

}