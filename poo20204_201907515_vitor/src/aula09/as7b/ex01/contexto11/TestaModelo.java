package aula09.as7b.ex01.contexto11;

/*
  Exercício 1
*/

public class TestaModelo {
    public static void main(String[] args) {
        Empregado emp = new Empregado("Projeto T","4444", "Vitor Pereira", 18);
        Veiculo v = new Veiculo("Projeto X", 459874, emp);

        v.setPlaca(123654);
        emp.setIdade(19);

        System.out.println(emp);
        System.out.println(v);

        emp.imprimir();
        v.imprimir();
    }
}