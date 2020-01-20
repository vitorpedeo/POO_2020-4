package aula01.as1c.ex03;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/*
  Exercício 3
*/

public class Vetor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor: ");
        int n = teclado.nextInt();
        int[] vetor = new int[n];
        int i;

        System.out.println("Digite os " + n + " valores do vetor:");
        for (i = 0; i < n; i++) {
            vetor[i] = teclado.nextInt();
        }

        Arrays.sort(vetor);
        System.out.println("Ordem crescente: ");
        for (i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");

        Integer[] vetorSecundario = new Integer[n];
        for (i = 0; i < n; i++) {
            vetorSecundario[i] = vetor[i];
        }
        Arrays.sort(vetorSecundario, Collections.reverseOrder());
        System.out.println("Ordem decrescente: ");
        for (i = 0; i < n; i++) {
            System.out.print(vetorSecundario[i] + " ");
        }
        System.out.println("");

        System.out.println("Informe um valor a ser procurado no vetor: ");
        int valor = teclado.nextInt();
        int res = Arrays.binarySearch(vetor, valor);

        if (res >= 0) {
            System.out.println("O valor " + valor + " está na posição " + res + " do vetor");
        } else {
            System.out.println("O valor não se encontra no vetor");
        }
        teclado.close();
    }

}