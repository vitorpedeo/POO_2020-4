package aula03.as3b.ex02;

import java.util.Scanner;

/*
  Exercício 2
*/

public class TestaAgenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();

        for (int i = 0; i < 10; i++) {
            System.out.println("\nInforme o nome " + (i + 1) + " :");
            String nome = teclado.nextLine();

            System.out.println("Informe a idade " + (i + 1) + " :");
            int idade = teclado.nextInt();

            System.out.println("informe a altura " + (i + 1) + " :");
            double altura = teclado.nextDouble();
            teclado.nextLine();

            agenda.armazenaPessoa(nome, idade, altura);
        }

        String nomeAux;

        System.out.println("\nDigite o nome do contato a ser removido (Digite não para ignorar):");
        nomeAux = teclado.nextLine();
        if (!nomeAux.equalsIgnoreCase("Nao")) {
            agenda.removePessoa(nomeAux);
            System.out.println("Contato Removido!");
        }

        System.out.println("\nDigite o nome do contato a ser buscado (Digite não para ignorar):");
        nomeAux = teclado.nextLine();
        if (!nomeAux.equalsIgnoreCase("Nao")) {
            System.out.println("O contato informado se encontra na posição " + agenda.buscaPessoa(nomeAux));
        }

        agenda.imprimeAgenda();

        System.out.println("Digite a poisção do contato desejado: ");
        agenda.imprimePessoa(teclado.nextInt());

        teclado.close();
    }
}