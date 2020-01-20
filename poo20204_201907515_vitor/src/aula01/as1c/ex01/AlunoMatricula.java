package aula01.as1c.ex01;

import java.util.Scanner;

/*
  Exercício 1
*/

public class AlunoMatricula {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de alunos na turma: ");
        int x = teclado.nextInt();
        String[] matricula = new String[x];
        String[] nome = new String[x];
        String[] lista = new String[x];
        int i;

        for (i = 0; i < x; i++) {

            System.out.println("Digite o nome do Aluno: ");
            nome[i] = teclado.next();

            System.out.println("Digite a matrícula do Aluno: ");
            matricula[i] = teclado.next();

            lista[i] = matricula[i] + "-" + nome[i];

        }

        System.out.println("");
        System.out.println("Lista de Alunos:");
        for (i = 0; i < x; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("");

        teclado.close();
    }

}