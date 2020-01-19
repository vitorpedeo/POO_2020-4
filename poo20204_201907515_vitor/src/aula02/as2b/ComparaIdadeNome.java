package aula02.as2b;

/*
  Exercício 1
*/

import java.util.Scanner;

public class ComparaIdadeNome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro nome: ");
        String nome1 = teclado.next();
        System.out.println("Informe a sua idade: ");
        int idade1 = teclado.nextInt();

        System.out.println("Informe o segundo nome: ");
        String nome2 = teclado.next();
        System.out.println("Informe a sua idade: ");
        int idade2 = teclado.nextInt();

        System.out.println("Informe o terceiro nome: ");
        String nome3 = teclado.next();
        System.out.println("Informe a sua idade: ");
        int idade3 = teclado.nextInt();

        teclado.close();

        if (idade1 > idade2 && idade2 > idade3) {
            System.out.println(nome1 + " é a pessoa mais velha e tem " + idade1 + " ano(s)");
            System.out.println(nome3 + " é a pessoa mais nova e tem " + idade3 + " ano(s)");
        } else if (idade1 > idade3 && idade3 > idade2) {
            System.out.println(nome1 + " é a pessoa mais velha e tem " + idade1 + " ano(s)");
            System.out.println(nome2 + " é a pessoa mais nova e tem " + idade2 + " ano(s)");
        } else if (idade2 > idade1 && idade1 > idade3) {
            System.out.println(nome2 + " é a pessoa mais velha e tem " + idade2 + " ano(s)");
            System.out.println(nome3 + " é a pessoa mais nova e tem " + idade3 + " ano(s)");
        } else if (idade2 > idade3 && idade3 > idade1) {
            System.out.println(nome2 + " é a pessoa mais velha e tem " + idade2 + " ano(s)");
            System.out.println(nome1 + " é a pessoa mais nova e tem " + idade1 + " ano(s)");
        } else if (idade3 > idade1 && idade1 > idade2) {
            System.out.println(nome3 + " é a pessoa mais velha e tem " + idade3 + " ano(s)");
            System.out.println(nome2 + " é a pessoa mais nova e tem " + idade2 + " ano(s)");
        } else if (idade3 > idade2 && idade2 > idade1) {
            System.out.println(nome3 + " é a pessoa mais velha e tem " + idade3 + " ano(s)");
            System.out.println(nome1 + " é a pessoa mais nova e tem " + idade1 + " ano(s)");
        }
    }
}