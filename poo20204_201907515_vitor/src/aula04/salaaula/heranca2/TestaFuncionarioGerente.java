package aula04.salaaula.heranca2;

public class TestaFuncionarioGerente {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Vitor", "12345678900", 1000);
        System.out.println("\nSalário do Funcionário sem bonificação: " + f.getSalario());
        System.out.println("Salário do Funcionário com bonificação: " + f.calculaBonificacao() + "\n");

        //Importante
        Funcionario g = new Gerente("Vitao", "98765432100", 20000);
        System.out.println("\nSalário do Gerente sem bonificação: " + g.getSalario());
        System.out.println("Salário do Gerente com bonificação: " + g.calculaBonificacao() + "\n");
    }
}