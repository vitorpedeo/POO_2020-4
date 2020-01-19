package aula01.as1c;

import java.util.Scanner;
/*
  Exercício 5
*/

public class ComparaSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de funcionários da empresa: ");
        int x = teclado.nextInt();

        int i;
        String[] nomes = new String[x];
        double[] salarios = new double[x];

        for (i = 0; i < x; i++) {
            System.out.println("Informe o nome do funcionário: ");
            nomes[i] = teclado.next();

            System.out.println("Informe o salário do funcionário: ");
            salarios[i] = teclado.nextDouble();
        }

        teclado.close();

        double maior = 0, menor = 1000000000, somaSalario = 0;
        int posicao = 0;
        String nome = new String();

        for (i = 0; i < x; i++) {
            if (salarios[i] > maior) {
                maior = salarios[i];
                posicao = i;
                nome = nomes[i];
            }
            somaSalario += salarios[i];
        }
        System.out.println("\nMaior Salário: " + maior + " - Nome: " + nome + " - Posição: " + posicao);

        for (i = 0; i < x; i++) {
            if (salarios[i] < menor) {
                menor = salarios[i];
                posicao = i;
                nome = nomes[i];
            }
        }
        System.out.println("Menor Salário: " + menor + " - Nome: " + nome + " - Posição: " + posicao);
        
        double mediaSalarial = somaSalario/x;
        System.out.println("Média Salarial: " + mediaSalarial);

        System.out.println("\nMaiores que a média:");
        for (i = 0 ; i < x ; i++) {
           if (salarios[i] > mediaSalarial) {
            System.out.println("Salário: " + salarios[i] + " - Nome: " + nomes[i] + " - Posição: " + i);
           }
        }

        System.out.println("\nMenores que a média:");
        for (i = 0 ; i < x ; i++) {
           if (salarios[i] < mediaSalarial) {
            System.out.println("Salário: " + salarios[i] + " - Nome: " + nomes[i] + " - Posição: " + i);
           }
        }
        System.out.println("");

    }
}