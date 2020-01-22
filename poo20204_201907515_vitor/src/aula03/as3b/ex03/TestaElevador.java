package aula03.as3b.ex03;

import java.util.Scanner;

/*
  Exercício 3
*/

public class TestaElevador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Elevador e = new Elevador();

        System.out.println("Informe a capacidade do elevador: ");
        int capacidade = teclado.nextInt();

        System.out.println("Informe o total de andares do prédio: ");
        int totalAndares = teclado.nextInt();

        e.inicializa(capacidade, totalAndares);

        String decisao;

        while (true) {
            System.out.println("\nDeseja que alguém entre ou saia do elevador?");
            System.out.println("Digite Entre para adicionar, Sair para remover ou Fim para finalizar a operação");
            decisao = teclado.next();
            if (decisao.equalsIgnoreCase("Entre")) {
                if (e.entra()) {
                    System.out.println("Pessoa adicionada no elevador!");
                    System.out.println("O elevador possui " + e.getNumeroPessoas() + " pessoa(s)");
                } else {
                    System.out.println("O elevador já está com sua capacidade máxima!\n");
                }
            } else if (decisao.equalsIgnoreCase("Sair")) {
                if (e.sai()) {
                    System.out.println("Pessoa removida do elevador!");
                    System.out.println("O elevador possui " + e.getNumeroPessoas() + " pessoa(s)");
                } else {
                    System.out.println("Não há ninguém no elevador!\n");
                }
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("\nDeseja que o elevador suba ou desça um nível?");
            System.out.println(
                    "Digite Subir para subir um nível, Descer para descer um nível ou Fim para finalizar a operação");
            decisao = teclado.next();
            if (decisao.equalsIgnoreCase("Subir")) {
                if (e.sobe()) {
                    System.out.println("O elevador subiu um nível!");
                    System.out.println("O elevador está no " + e.getAndarAtual() + " andar");
                } else {
                    System.out.println("O elevador já está no último andar!\n");
                }
            } else if (decisao.equalsIgnoreCase("Descer")) {
                if (e.desce()) {
                    System.out.println("O elevador desceu um nível!");
                    System.out.println("O elevador está no " + e.getAndarAtual() + " andar");
                } else {
                    System.out.println("O elevador já está no térreo!\n");
                }
            } else {
                break;
            }
        }

        System.out.println("\nOperação Finalizada!\n");
        teclado.close();
    }
}