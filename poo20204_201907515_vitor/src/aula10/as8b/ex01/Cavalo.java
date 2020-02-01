package aula10.as8b.ex01;

public class Cavalo extends Animal {

    public Cavalo() {
        
    }

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("*Relinche*");
    }

    public void correr() {
        System.out.println("*Cavalo correndo*");
    }
}