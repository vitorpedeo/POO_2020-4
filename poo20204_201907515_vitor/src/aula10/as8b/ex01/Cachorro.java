package aula10.as8b.ex01;

public class Cachorro extends Animal {

    public Cachorro() {
        
    }

    public Cachorro(String nome, int idade) {
         super(nome,idade);
    }

    public void emitirSom() {
        System.out.println("*Latido*");
    }

    public void correr() {
        System.out.println("*Cachorro correndo*");
    }

}