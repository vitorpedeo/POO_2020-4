package aula14.as12b.ex01;

/*
 Exercício 1
*/

/* Mesma classe relativa a Lista AS8b,
 * com alteração nos métodos emitirSom
 * e subirArvore a fim de facilitar
 * os testes
 */

public class Preguica extends Animal {

    public Preguica() {

    }

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public String emitirSom() {
        return "*Som de Bicho-Preguiça*";
    }

    public String subirArvore() {
        return "*Bicho-Preguiça subindo na árvore*";
    }
}