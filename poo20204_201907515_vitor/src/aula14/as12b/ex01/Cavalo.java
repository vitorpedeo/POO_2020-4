package aula14.as12b.ex01;

/*
 Exercício 1
*/

/* Mesma classe relativa a Lista AS8b,
 * com alteração nos métodos emitirSom
 * e correr a fim de facilitar os testes
 */

public class Cavalo extends Animal {

    public Cavalo() {
        
    }

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public String emitirSom() {
        return "*Relinche*";
    }

    public String correr() {
        return "*Cavalo correndo*";
    }
}