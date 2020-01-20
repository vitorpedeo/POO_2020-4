package aula01.as1c.ex04;

import java.util.Scanner;

/*
  Exercício 4
*/

public class TestaContato {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Contato c1 = new Contato();

        System.out.println("Informe o nome do contato: ");
        c1.setNome(teclado.nextLine());

        System.out.println("Informe o número do contato: ");
        c1.setTelefone(teclado.next());

        if (c1.valida()) {
            System.out.println("Contato Válido!");
        } else {
            System.out.println("Contato Inválido!");
        }
        teclado.close();
    }

}