package aula02.universidade;

import java.util.Scanner;

public class TestaCurso {

	public static void main (String[] args) {
   		
		//Curso 1
		Curso c1 = new Curso();
	
	    Scanner sc = new Scanner (System.in);	
		
		System.out.println("Informe o nome do curso: ");
		c1.nome = sc.nextLine();
		
		System.out.println("Informe a área do curso: ");
		c1.area = sc.nextLine();
		
		System.out.println("Informe a duração do curso: ");
		c1.duracao = Integer.parseInt(sc.nextLine());
		
		System.out.println("Informe o tipo do curso: ");
		c1.tipo = sc.nextLine();
		
		System.out.println("Curso 1: " + c1.nome + " - " + c1.area + " - " + c1.duracao + " horas - " +  c1.tipo + "\n");
		
		//Curso 2
        Curso c2 = new Curso();
        
        System.out.println("Informe o nome do curso: ");
		c2.nome = sc.nextLine();
		
		System.out.println("Informe a área do curso: ");
		c2.area = sc.nextLine();
		
		System.out.println("Informe a duração do curso: ");
		c2.duracao = Integer.parseInt(sc.nextLine());
		
		System.out.println("Informe o tipo do curso: ");
		c2.tipo = sc.nextLine();
		
		System.out.println("Curso 2: " + c2.nome + " - " + c2.area + " - " + c2.duracao + " horas - " +  c2.tipo + "\n");

		
	}
	
}
