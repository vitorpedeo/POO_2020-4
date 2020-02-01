package aula10.salaaula.exemplo02;

public class TestaHeranca{
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSalario(3000);

        System.out.println("Bonificação do Gerente é " + g.bonificacao() + " reais");

        Funcionario f = new Funcionario();
        f.setSalario(3000);

        System.out.println("Bonificação do Funcionário é " + f.bonificacao() + " reais");

        Funcionario ger = new Gerente();
        ger.setSalario(3000);

        System.out.println("Bonficação é " + ger.bonificacao() + " reais");
    }
}