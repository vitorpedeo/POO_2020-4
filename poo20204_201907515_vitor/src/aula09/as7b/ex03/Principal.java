package aula09.as7b.ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
  Exercício 3
*/

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);

        Artista[] autores = new Artista[5];
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        data = sdf.parse("29/03/1500");
        /*
         * Vou utilizar apenas uma Data para todos os campos necessários nesse problema
         * pois ela é uma informação irrelevante nesse contexto.
         */
        autores[0] = new Artista("Leonardo da Vinci", data, "Anchiano");
        autores[1] = new Artista("Sandro Botticelli", data, "Firenze");
        autores[2] = new Artista("Pablo Picasso", data, "Málaga");
        autores[3] = new Artista("Vincent van Gogh", data, "Zundert");
        autores[4] = new Artista("Michelangelo Buonarroti", data, "Caprese Michelangelo");

        Obra[] obras = new Obra[5];
        obras[0] = new Obra("Mona Lisa", 1000000, data, "Quadro", "Tinta", autores[0]);
        obras[1] = new Obra("Vênus e Marte", 500000, data, "Quadro", "Tinta", autores[1]);
        obras[2] = new Obra("Guernica", 1000000, data, "Quadro", "Tinta", autores[2]);
        obras[3] = new Obra("A Noite Estrelada", 750000, data, "Quadro", "Tinta", autores[3]);
        obras[4] = new Obra("David", 400000, data, "Escultura", "Mármore", autores[4]);

        System.out.println("\nObras do Acervo (várias unidades):");
        for (Obra o : obras) {
            System.out.println(o.getTitulo());
        }
        System.out.println("");

        List<Venda> vendas = new ArrayList<Venda>();
        System.out.println("Digite o nome do Comprador: (Digite Cancelar para parar a operação)");
        String nome = teclado.nextLine();

        while (!nome.equals("Cancelar")) {
            Cliente cliente = new Cliente();
            cliente.setNome(nome);
            Venda venda = new Venda();

            System.out.println("Digite o CPF do Comprador:");
            cliente.setCpf(teclado.nextLine());

            System.out.println("Digite o Telefone do Comprador:");
            cliente.setTelefone(teclado.nextLine());

            venda.setComprador(cliente);

            System.out.println("Digite o Nome da Obra vendida:");
            String nomeObra = teclado.nextLine();

            for (int i = 0; i < 5; i++) {
                if (nomeObra.equals(obras[i].getTitulo())) {
                    venda.setObraVendida(obras[i]);
                }
            }

            System.out.println("Digite a Data da Venda (dd/mm/aaaa):");
            venda.setDataVenda(sdf.parse(teclado.nextLine()));

            vendas.add(venda);

            System.out.println("\n*********************");
            System.out.println("**Venda Registrada!**");
            System.out.println("*********************\n");

            System.out.println("Digite o nome do Comprador: (Digite Cancelar para parar a operação)");
            nome = teclado.nextLine();
        }

        System.out.println("\nVendas Registradas:");
        for (Venda v : vendas) {
            v.imprimirDados();
        }
        teclado.close();
    }
}