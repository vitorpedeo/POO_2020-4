package aula01;

import java.text.DecimalFormat;

/*
  Exerc�cio 01
*/

public class CalculaMediaEstruturada {
   public static void main (String[] args) {
	   String nomeAluno1 = "Vitor";
	   double nota1Aluno1 = 10;
	   double nota2Aluno1 = 8.5;
	   double nota3Aluno1 = 9;
       
	   String nomeAluno2 = "Maria";
	   double nota1Aluno2 = 9.5;
	   double nota2Aluno2 = 6.5;
	   double nota3Aluno2 = 7;
	   
	   String nomeAluno3 = "Paulo";
	   double nota1Aluno3 = 10;
	   double nota2Aluno3 = 8.5;
	   double nota3Aluno3 = 5.9;
	   
	   String nomeAluno4 = "Sophia";
	   double nota1Aluno4 = 10;
	   double nota2Aluno4 = 10;
	   double nota3Aluno4 = 10;
	   
	   double mediaAluno1 = (nota1Aluno1 + nota2Aluno1 + nota3Aluno1)/3;
	   double mediaAluno2 = (nota1Aluno2 + nota2Aluno2 + nota3Aluno2)/3;
	   double mediaAluno3 = (nota1Aluno3 + nota2Aluno3 + nota3Aluno3)/3;
	   double mediaAluno4 = (nota1Aluno4 + nota2Aluno4 + nota3Aluno4)/3;
	   
	   double mediaGeral = (mediaAluno1 + mediaAluno2 + mediaAluno3 + mediaAluno4)/4;
	   
	   DecimalFormat df = new DecimalFormat("#,###.00");
	   
	   System.out.println("Aluno: " + nomeAluno1 + " - M�dia: " + df.format(mediaAluno1));
	   System.out.println("Aluno: " + nomeAluno2 + " - M�dia: " + df.format(mediaAluno2));
	   System.out.println("Aluno: " + nomeAluno3 + " - M�dia: " + df.format(mediaAluno3));
	   System.out.println("Aluno: " + nomeAluno4 + " - M�dia: " + df.format(mediaAluno4));
	   
	   System.out.println("M�dia Geral: " + df.format(mediaGeral));
   }
	
}
