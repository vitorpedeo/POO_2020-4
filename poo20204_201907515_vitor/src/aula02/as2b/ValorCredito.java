package aula02.as2b;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
  Exercício 4
*/

public class ValorCredito {
   public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       DecimalFormat df = new DecimalFormat("#0.00");

       System.out.println("\nInforme o seu saldo médio: ");
       double saldoMedio = teclado.nextDouble();
       double credito = 0;
       teclado.close();

       if (saldoMedio <= 200) {
           System.out.println("\nSaldo Médio: R$" + df.format(saldoMedio));
           System.out.println("Valor do Crédito disponível: R$" + df.format(credito) + "\n"); 
       }else
       if (saldoMedio >= 201 && saldoMedio <= 400) {
           credito = 0.2 * saldoMedio; 
           System.out.println("\nSaldo Médio: R$" + df.format(saldoMedio));
           System.out.println("Valor do Crédito disponível: R$" + df.format(credito) + "\n"); 
       }else
       if (saldoMedio >= 401 && saldoMedio <= 600) {
            credito = 0.3 * saldoMedio;
            System.out.println("\nSaldo Médio: R$" + df.format(saldoMedio));
            System.out.println("Valor do Crédito disponível: R$" + df.format(credito) + "\n"); 
       }else{
            credito = 0.4 * saldoMedio;
            System.out.println("\nSaldo Médio: R$" + df.format(saldoMedio));
            System.out.println("Valor do Crédito disponível: R$" + df.format(credito) + "\n"); 
       }
   }
}