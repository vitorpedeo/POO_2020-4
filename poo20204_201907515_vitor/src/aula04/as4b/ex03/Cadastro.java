package aula04.as4b.ex03;

public class Cadastro {
    public static void main(String[] args) {
        Pessoa caixa = new Caixa("Sophia da Costa", "96541-8874", 125, 2000, 8);

        System.out.println("\nCaixa:");
        if (caixa instanceof Caixa) {
            Caixa funcCaixa = (Caixa) caixa;
            System.out.println(funcCaixa);
            funcCaixa.aumentaSalario(10);
            System.out.println("Após aumento de 10% do salário:");
            System.out.println(funcCaixa);
        }

        Pessoa gerente = new Gerente("Vitor Pereira de Oliveira", "98745-2133", 126, 10000, 5, "PF");

        System.out.println("Gerente:");
        if (gerente instanceof Gerente) {
            Gerente funcGerente = (Gerente) gerente;
            System.out.println(funcGerente);
            funcGerente.aumentaSalario(20);
            System.out.println("Após aumento de 20% do salário:");
            System.out.println(funcGerente);
        }

        Pessoa cliente1 = new Cliente("João da Silva", "96521-7485", 28, "12345678900");
        if (cliente1 instanceof Cliente) {
            Cliente c1 = (Cliente) cliente1;
            c1.desativa();
            c1.mostraDados();
        }

        Pessoa cliente2 = new Cliente("Marcos Oliveira", "98745-6621", 52, "98765432100");
        if (cliente2 instanceof Cliente) {
            Cliente c2 = (Cliente) cliente2;
            c2.mostraDados();
        }
        Pessoa cliente3 = new Cliente("Patrícia Oliveira", "97145-6633", 42, "12378945600");
        if (cliente3 instanceof Cliente) {
            Cliente c3 = (Cliente) cliente3;
            c3.mostraDados();
        }
    }
}