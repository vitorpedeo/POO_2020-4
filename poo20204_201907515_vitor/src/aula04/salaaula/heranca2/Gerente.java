package aula04.salaaula.heranca2;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    //Sobrescrita de método
    @Override
    public double calculaBonificacao() {
        double salario = this.getSalario();
        return salario *= 1.15;
    }
}