package aula10.salaaula.exemplo01;

public class MundoAnimal {
    public static void main(String[] args) {
        Animal[] reino = new Animal[3];

        reino[0] = new Anfibio("Salamandra");
        reino[1] = new Ave("Quero-Quero");
        reino[2] = new Peixe("Dourado");

        for (int i = 0; i < 3; i++) {
            if (reino[i] instanceof Peixe) {
                ((Peixe) reino[i]).nadar();
            } else {
                reino[i].mover(10, 10);
            }
        }
    }
}