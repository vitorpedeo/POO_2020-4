package aula10.as8b.ex01;

public class Preguica extends Animal {

    public Preguica() {

    }

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("*Som de Bicho-Preguiça*");
    }

    public void subirArvore() {
        System.out.println("*Bicho-Preguiça subindo na árvore*");
    }
}