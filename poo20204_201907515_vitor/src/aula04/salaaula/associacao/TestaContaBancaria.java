package aula04.salaaula.associacao;

import java.util.ArrayList;
import java.util.List;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumero(324566);
        contaBancaria.setSaldo(15000.0d);
        contaBancaria.setLimite(500);
        contaBancaria.setTipo("Corrente");

        List<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cliente = new Cliente();
        cliente.setNome("Maria Das Dores");
        cliente.setCpf("12345678900");
        cliente.setEndereco("Rua JJ Número 65, Mazargão, Goiás");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Josefino Pinto");
        cliente2.setCpf("98765432100");
        cliente2.setEndereco("Rua GG Número 28, Goianápolis, Goiás");

        clientes.add(cliente);
        clientes.add(cliente2);

        contaBancaria.setTitulares(clientes);

        System.out.println("Nomes dos Titulares da Conta:");
        for (Cliente c : contaBancaria.getTitulares()) {
             System.out.println(c.getNome());
        }

    }
}