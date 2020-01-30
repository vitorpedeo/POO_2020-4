package aula09.salaaula.interfaces;

public class Exemplo implements IExemplo,IExemplo2{
    
    @Override
    public void metodo1() {
        System.out.println("Implementando método 1!");
    }

    @Override
    public String metodo2() {
        return "Implementando método 2!";
    }

    @Override
    public void metodo3() {
        System.out.println("Implementando método 3!");
    }

    public static void main(String[] args) {
        Exemplo e = new Exemplo();

        e.metodo1();
        System.out.println(e.metodo2());
        e.metodo3();
    }
}