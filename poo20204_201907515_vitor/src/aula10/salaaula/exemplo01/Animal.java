package aula10.salaaula.exemplo01;

public class Animal {

    private String nome;
    private int coordenadaX;
    private int coordenadaY;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {
        this.nome = "Anônimo";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public void setCoordenadas(int x, int y) {
        this.coordenadaX = x;
        this.coordenadaY = y;
    }

    public void mover(int x, int y) {
        System.out.println("Não sei me mover\n");
    }
}