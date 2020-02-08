package aula14.as12b.ex01;

/*
 Exercício 1
*/

/* Mesma classe relativa a Lista AS8b,
 * com alteração nos métodos emitirSom
 * e correr a fim de facilitar os testes
 */

public class Cachorro extends Animal {

    public Cachorro() {
        
    }

    public Cachorro(String nome, int idade) {
         super(nome,idade);
    }

    public String emitirSom() {
        return "*Latido*";
    }

    public String correr() {
        return "*Cachorro correndo*";
    }

}