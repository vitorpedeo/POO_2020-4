package aula10.salaaula.exemplo01;

public class Anfibio extends Animal {

    public Anfibio(String nome) {
        super(nome);
    }

    public void mover(int x, int y) {
        this.setCoordenadas(x, y);
        System.out.println("Movimento do Anfíbio " + this.getNome() + "\n");
    }
}