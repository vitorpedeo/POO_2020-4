package aula09.as7b.ex02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  Exercício 2
*/

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        List<Obra> listaObras = new ArrayList<Obra>();

        System.out.println("\nInforme o título da Obra a ser registrada: (Digite Cancelar para parar a operação)");
        String titulo = teclado.nextLine();

        while (!titulo.equals("Cancelar")) {
            Obra obra = new Obra();
            obra.setTitulo(titulo);

            System.out.println("Informe o preço da Obra:");
            System.err.print("R$");
            obra.setPreco(teclado.nextDouble());
            teclado.nextLine();

            System.out.println("Informe a data de criação da Obra (dd/mm/aaaa):");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            obra.setDataCriacao(sdf.parse(teclado.nextLine()));

            System.out.println("Informe o tipo (Quadro ou Escultura) da Obra:");
            obra.setTipo(teclado.nextLine());

            System.err.println("Informe o material da Obra:");
            obra.setMaterial(teclado.nextLine());

            Artista autor = new Artista();
            System.out.println("Informe o Autor da Obra:");
            autor.setNome(teclado.nextLine());

            System.out.println("Informe sua Data de Nascimento:");
            autor.setDataNascimento(sdf.parse(teclado.nextLine()));

            System.out.println("Informe seu Local de Nascimento:");
            autor.setLocalNascimento(teclado.nextLine());

            System.out.println("Essa Obra já está vendida? (Digite Sim para confirmar ou Nao para ignorar)");
              if (teclado.nextLine().equals("Sim")) {
                    obra.alterarSituacao();
                 System.out.println("\nSituação alterado com sucesso!");      
              } 

            obra.setAutor(autor);

            listaObras.add(obra);
            System.out.println("\n********************************");
            System.out.println("***Obra adicionada no acervo!***");
            System.out.println("********************************\n");

            System.out.println("Informe o título da obra a ser registrada: (Digite Cancelar para parar a operação)");
            titulo = teclado.nextLine();
        }

        System.out.println("\nObras Cadastradas:");
        for (Obra o : listaObras) {
             o.imprimirDados();
        }

        teclado.close();
    }
}