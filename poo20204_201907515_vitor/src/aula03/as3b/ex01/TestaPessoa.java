package aula03.as3b.ex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
  Exercício 1
*/

public class TestaPessoa {
    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        System.out.println("Informe seu nome: ");
        p1.setNome(teclado.nextLine());

        System.out.println("Informe a sua data de nascimento (dd/mm/aaaa): ");
        String d = teclado.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(d);
        p1.setDataNascimento(data);

        System.out.println("Informe sua altura (em cm): ");
        p1.setAltura(teclado.nextDouble());

        teclado.close();

        System.out.println(p1);
        System.out.println(p1.getNome() + ", você tem " + p1.calculaIdade() + " anos!\n");
    }
}