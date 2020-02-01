package aula10.salaaula.exemplo01;

public class Ave extends Animal {
    public Ave(String nome) {
        super(nome);
    }

    public void mover(int x, int y) {
        this.setCoordenadas(x, y);
        System.out.println("Movimento da Ave " + this.getNome() + "\n");
    }
}