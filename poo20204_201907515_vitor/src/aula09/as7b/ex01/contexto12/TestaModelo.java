package aula09.as7b.ex01.contexto12;

/*
  Exercício 1
*/

public class TestaModelo {
    public static void main(String[] args) {
        Empregado e = new Empregado("VH-125", "Arnold Schwarzenegger", 65);
        Veiculo v = new Veiculo(8942, e);

        v.setPlaca(1259874);

        System.out.println(e);
        System.out.println(v);

        e.imprimir();
        v.imprimir();
    }
}