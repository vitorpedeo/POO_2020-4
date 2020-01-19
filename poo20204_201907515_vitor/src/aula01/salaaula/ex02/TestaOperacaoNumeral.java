package aula01.salaaula.ex02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestaOperacaoNumeral {

   public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#,###.00");
      OperacaoNumeral numeros = new OperacaoNumeral();

      System.out.println("Informe o primeiro número: ");
      numeros.numero1 = teclado.nextInt();

      System.out.println("Informe o segundo número: ");
      numeros.numero2 = teclado.nextInt();

      if (numeros.numerosIntervalo(numeros.numero1, numeros.numero2) < 1) {
         System.out.println("Não existem valores inteiros entre os números informados!");
      } else {

         // Item (a)
         System.out.println("Existe(m) " + numeros.numerosIntervalo(numeros.numero1, numeros.numero2)
               + " número(s) inteiros entre os valores");

         // Item (b)
         System.out.println("Soma: " + numeros.somaIntervalo(numeros.numero1, numeros.numero2));

         // Item (c)
         System.out.println("Média: " + df.format(numeros.mediaIntervalo(numeros.numero1, numeros.numero2)));

         // Item (d) e (e)
         int[] parOuImpar = numeros.imparParIntervalo(numeros.numero1, numeros.numero2);
         System.out.println("Existe(m) " + parOuImpar[0] + " número(s) par(es) no intervalo");
         System.out.println("Existe(m) " + parOuImpar[1] + " número(s) ímpar(es) no intervalo");

      }
      teclado.close();
   }

}