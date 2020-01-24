package aula04.as4b.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  Exercício 2
*/

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

        while (true) {
            System.out.println("\nInforme a matrícula do Funcionário a ser cadastrado:");
            System.out.println("Digite 0 para finalizar a operação");
            int matricula = teclado.nextInt();
            teclado.nextLine();

            if (matricula == 0) {
                System.out.println("\nFuncionários cadastrados: ");
                for (Funcionario f : listaFuncionarios) {
                    f.mostraDados();
                }
                System.out.println("");
                break;
            } else {
                System.out.println("Informe o nome do Funcionário: ");
                String nome = teclado.nextLine();
                System.out.println("Informe o CPF do Funcionário: ");
                String cpf = teclado.nextLine();
                Funcionario func = new Funcionario(nome, cpf, matricula);
                System.out.println("Informe o cargo do Funcionário: ");
                func.setCargo(teclado.nextLine());
                System.out.println("Informe o salário do Funcionário: ");
                func.setSalario(teclado.nextDouble());
                teclado.nextLine();
                System.out.println("Informe o departamento do Funcionário: ");
                func.setDepartamento(teclado.nextLine());

                System.out.println("Endereço do Funcionário: ");
                System.out.println("Informe a rua:");
                String rua = teclado.nextLine();
                System.out.println("Informe o número: ");
                int numero = teclado.nextInt();
                Endereco end = new Endereco(rua, numero);
                teclado.nextLine();
                System.out.println("Informe a quadra: ");
                end.setQuadra(teclado.nextInt());
                System.out.println("Informe o lote: ");
                end.setLote(teclado.nextInt());
                teclado.nextLine();
                System.out.println("Informe o complemento: ");
                end.setComplemento(teclado.nextLine());
                System.out.println("Informe o bairro: ");
                end.setBairro(teclado.nextLine());
                System.out.println("Informe a cidade: ");
                end.setCidade(teclado.nextLine());
                System.out.println("Informe o Estado: ");
                end.setEstado(teclado.nextLine());
                func.setEndereco(end);
                listaFuncionarios.add(func);
            }
        }

        System.out.println("Salários com aumento de 30%: ");
        for (Funcionario f : listaFuncionarios) {
            System.out.println("Nome : " + f.getNome() + " - Salário : " + f.aumentaSalario(30));
        }
        System.out.println("");
        teclado.close();
    }
}