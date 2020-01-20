package aula02.as2b.ex05;

import java.util.Scanner;

/*
  Exercício 5
*/

public class TestaPessoa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        System.out.println("Informe seu nome: ");
        p1.setNome(teclado.nextLine());
        System.out.println("Informe sua idade: ");
        p1.setIdade(teclado.nextInt());

        teclado.nextLine();

        Pessoa pai = new Pessoa();
        System.out.println("Informe o nome do seu pai: ");
        pai.setNome(teclado.nextLine());
        System.out.println("Informe a idade do seu pai");
        pai.setIdade(teclado.nextInt());
        pai.mae = null; /*
                         * Professor, não consegui implementar os pais do pai da primeira pessoa
                         * definida, por isso deixei null
                         */
        pai.pai = null;

        teclado.nextLine();

        Pessoa mae = new Pessoa();
        System.out.println("Informe o nome da sua mãe: ");
        mae.setNome(teclado.nextLine());
        System.out.println("Informe a idade da sua mãe");
        mae.setIdade(teclado.nextInt());
        mae.mae = null; /*
                         * Professor, não consegui implementar os pais da mãe da primeira pessoa
                         * definida, por isso deixei null
                         */
        mae.pai = null;

        p1.setPai(pai);
        p1.setMae(mae);

        System.out.println("\nSeu nome: " + p1.getNome());
        System.out.println("Sua idade: " + p1.getIdade());
        System.out.println("Nome do seu pai: " + pai.getNome());
        System.out.println("Idade do seu pai: " + pai.getIdade());
        System.out.println("Nome da sua mãe: " + mae.getNome());
        System.out.println("Idade da sua mãe: " + mae.getIdade() + "\n");

        teclado.close();

    }
}