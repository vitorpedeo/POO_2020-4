package aula02.as2b.ex02;

import java.util.Scanner;

/*
  Exercício 2
*/

public class CustoFabrica {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o custo de fábrica para o carro: ");
    double custo = teclado.nextDouble();
    double custoCarro = custo + 0.28 * custo + 0.45 * custo;

    System.out.println("O custo do carro é: R$" + custoCarro);

    teclado.close();
  }
}