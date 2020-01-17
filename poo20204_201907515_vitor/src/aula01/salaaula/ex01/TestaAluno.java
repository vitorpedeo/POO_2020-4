package aula01.salaaula.ex01;

import java.text.DecimalFormat;

/*
  Exercício 01 OO
*/

public class TestaAluno {
	
   public static void main (String[] args) {
	   DecimalFormat df = new DecimalFormat("#,###.00"); 
	   
	  Aluno a1 = new Aluno();
	  a1.nome = "Vitor";
	  a1.nota1 = 10;
	  a1.nota2 = 8.9;
	  a1.nota3 = 9.5;
	  a1.media = a1.calculaMedia (a1.nota1, a1.nota2, a1.nota3);
	  
	  System.out.println("Média do Aluno 1: " + df.format(a1.media));
   
	  Aluno a2 = new Aluno();
	  a2.nome = "Mariana";
	  a2.nota1 = 9.3;
	  a2.nota2 = 7.7;
	  a2.nota3 = 8.8;
      a2.media = a2.calculaMedia (a2.nota1, a2.nota2, a2.nota3);
	  
	  System.out.println("Média do Aluno 2: " + df.format(a2.media));
	  
	  Aluno a3 = new Aluno();
	  a3.nome = "José";
	  a3.nota1 = 9.9;
	  a3.nota2 = 8.9;
	  a3.nota3 = 7.9;
      a3.media = a3.calculaMedia (a3.nota1, a3.nota2, a3.nota3);
	  
	  System.out.println("Média do Aluno 3: " + df.format(a3.media));
	  
	  Aluno a4 = new Aluno();
	  a4.nome = "Patrícia";
	  a4.nota1 = 6.5;
	  a4.nota2 = 8.1;
	  a4.nota3 = 5.5;
      a4.media = a4.calculaMedia (a4.nota1, a4.nota2, a4.nota3);
	  
	  System.out.println("Média do Aluno 4: " + df.format(a4.media));
	  
	  System.out.println("Média Geral: " + df.format((a1.media + a2.media + a3.media + a4.media)/4));
   
   }
}
