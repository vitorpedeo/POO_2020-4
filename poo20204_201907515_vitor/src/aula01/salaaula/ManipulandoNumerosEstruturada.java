package aula01.salaaula;

import java.util.Scanner;

/*
 Exerc�cio 02
*/

public class ManipulandoNumerosEstruturada {

public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	   
	   
	   System.out.print("Digite o primeiro n�mero: ");  	
	   int n1 = input.nextInt();
	   
	   System.out.print("Digite o segundo n�mero: ");
	   int n2 = input.nextInt();
	   
	   // Item (a)
	   
	   int elementos = Math.abs(n1 - n2) - 1;
	   
	     if (elementos < 1) {
	    	 System.out.println("N�o existem n�meros inteiros entre " + n1 + " e " + n2);
	     }else {
	   
	   System.out.println("Existe(m) " + elementos + " elemento(s) entre os valores informados");
	   
	   // Item (b)
	   
	   int maior;
	   int menor;
	   
	     if (n1 > n2) {
	    	 maior = n1;
	    	 menor = n2;
	     }else {
	    	 maior = n2;
	    	 menor = n1;
	     }
	   
	   int aux = menor + 1;  
	   int soma = 0; 
	   
	   while (aux < maior) {
		 soma += aux;
		 aux++;
	   }
	     
	   System.out.println("Soma dos valores: " + soma);
	   
	   // Item (c)
	   
	   double media = soma/elementos;
	   
	   System.out.println("M�dia entre os valores: " + media);
	   
	   //Item (d) e Item (e)
	   
	   int pares = 0;
	   int impares = 0;
	          
	       aux = menor + 1;
	       
	     while (aux < maior) {
	    	 if (aux % 2 == 0) {
	    		 pares++;
	    	 }else {
	    		 impares++;
	    	 }
	    	 aux++;
	     }
	   
	     System.out.println("Existe(m) " + pares + " n�mero(s) pares no intervalo");
	     System.out.println("Existe(m) " + impares + " n�mero(s) �mpares no intervalo");
	     
   }
 }	     
}
