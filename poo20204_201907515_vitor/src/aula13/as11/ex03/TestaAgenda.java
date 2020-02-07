package aula13.as11.ex03;

/*
  Exercício 3
*/

import java.io.IOException;
import java.util.Scanner;

public class TestaAgenda {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n----------------------");
        System.out.println("--Agenda de Contatos--");
        System.out.println("----------------------\n");

        Agenda agenda = new Agenda();

        for (int i = 0; i < 2; i++) {
            System.out.println("\nInforme o nome " + (i + 1) + " (Nome Sobrenome):");
            String nome = teclado.nextLine();

            System.out.println("Informe a idade " + (i + 1) + " :");
            int idade = teclado.nextInt();

            System.out.println("informe a altura " + (i + 1) + " (em cm):");
            double altura = teclado.nextDouble();
            teclado.nextLine();

            agenda.armazenaPessoa(nome, idade, altura);
        }

        System.out.println("Dados gravados em: " + System.getProperty("user.dir") + "\\src\\arquivos_as11\\Agenda.bin");
        agenda.gravaEmArquivo();

        teclado.close();
    }
}