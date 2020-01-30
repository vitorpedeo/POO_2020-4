package aula09.salaaula;

public class ClasseConcreta extends ClasseAbstrata {

    @Override
    public void metodo() {
        System.out.println("Implementação do método abstrato da Classe Abstrata na Classe Concreta!");
    }

    public static void main(String[] args) {
        ClasseConcreta cc = new ClasseConcreta();
        cc.metodoConcreto();
        cc.metodo();
    }
}