package aula10.salaaula.exemplo01;

public class Peixe extends Animal {
    public Peixe(String nome) {
        super(nome);
    }

    public void nadar() {
        System.out.println("Sou um " + this.getClass().getSimpleName() + " e estou nadando!\n");
    }

    public void mover(int x, int y) {
        this.setCoordenadas(x, y);
        System.out.println("Movimento do Peixe " + this.getNome() + "\n");
    }
}