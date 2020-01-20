package aula01.as1c.ex02;

import java.util.Scanner;

/*
  Exercício 2
*/

public class OrdemCrescente {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o primeiro número: ");
    int x = teclado.nextInt();

    System.out.println("Informe o segundo número: ");
    int y = teclado.nextInt();

    System.out.println("Informe o terceiro número: ");
    int z = teclado.nextInt();

    if (x > y && y > z) {
      System.out.println("Em ordem crescente: " + z + "," + y + "," + x);
    } else if (x > z && z > y) {
      System.out.println("Em ordem crescente: " + y + "," + z + "," + x);
    } else if (y > x && x > z) {
      System.out.println("Em ordem crescente: " + z + "," + x + "," + y);
    } else if (y > z && z > x) {
      System.out.println("Em ordem crescente: " + x + "," + z + "," + y);
    } else if (z > x && x > y) {
      System.out.println("Em ordem crescente: " + y + "," + x + "," + z);
    } else if (z > y && y > x) {
      System.out.println("Em ordem crescente: " + x + "," + y + "," + z);
    }
    teclado.close();
  }

}