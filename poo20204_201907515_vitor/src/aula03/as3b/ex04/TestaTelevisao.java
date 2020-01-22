package aula03.as3b.ex04;

import java.util.Scanner;

/*
  Exercício 4
*/

public class TestaTelevisao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto();
        controle.setTv(tv);  

        tv.liga();
        
        String decisao;
        String canal;
        System.out.println("\nDeseja trocar de canal?(Digite Sim ou Nao)");
        decisao = teclado.next();

        if (decisao.equalsIgnoreCase("Sim")) {
           System.out.println("\nDeseja trocar para o próximo canal ou um canal específico?");
           System.out.println("Digite Proximo ou Especifico");
           decisao = teclado.next();

           if (decisao.equalsIgnoreCase("Proximo")) {
               controle.mudaCanal();
               controle.status();
           }else{
               System.out.println("\nInforme o nome do canal:");
               canal = teclado.next();
               controle.trocaCanal(canal);
               controle.status();
           }
        }

        System.out.println("\nAumentar ou diminuir o volume da Televisão?");
        System.out.println("+ para aumentar, - para diminuir ou Fim para finalizar a operação");
        while (true) {
          decisao = teclado.next();
          if (decisao.equalsIgnoreCase("Fim")) {
             break;
          }else{
              controle.trocaVolume(decisao);
              controle.status();
          }
        }
          System.out.println("\nFim da operação!\n");
          teclado.close();
    }
}