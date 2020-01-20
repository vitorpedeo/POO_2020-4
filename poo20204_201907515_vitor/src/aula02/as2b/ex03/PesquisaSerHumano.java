package aula02.as2b.ex03;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
  Exercício 3
*/

public class PesquisaSerHumano {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Informe o número de pessoas a serem pesquisadas: ");
        int x = teclado.nextInt();

        SerHumano[] pessoas = new SerHumano[x];
        int i, maior = 0, itemB = 0;

        for (i = 0; i < x; i++) {
            System.out.println("\nInforme o sexo da pessoa " + (i + 1) + " :");
            pessoas[i] = new SerHumano();
            pessoas[i].setSexo(teclado.next());

            System.out.println("Informe a cor do olho da pessoa " + (i + 1) + " :");
            pessoas[i].setCorOlho(teclado.next());

            System.out.println("Informe a cor do cabelo da pessoa " + (i + 1) + " :");
            pessoas[i].setCorCabelo(teclado.next());

            System.out.println("Informe a idade da pessoa " + (i + 1) + " :");
            pessoas[i].setIdade(teclado.nextInt());

            if (pessoas[i].idade > maior) {
                maior = pessoas[i].idade;
            }

            if (pessoas[i].sexo.equalsIgnoreCase("Feminino") && pessoas[i].corOlho.equalsIgnoreCase("Verde")
                    && pessoas[i].corCabelo.equalsIgnoreCase("Louro")
                    && (pessoas[i].idade > 18 && pessoas[i].idade < 35)) {
                itemB++;
            }

        }

        teclado.close();

        // Item (a)
        System.out.println("\nA maior idade entre os pesquisados é: " + maior + " anos");

        // Item (b)
        System.out.println("Porcentagem de mulheres loiras com olho verde e idade entre 18 e 35 anos: "
                + df.format(100 * ((double) itemB / (double) x)) + "%\n");

    }
}