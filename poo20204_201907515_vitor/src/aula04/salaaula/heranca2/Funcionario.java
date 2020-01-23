package aula04.salaaula.heranca2;

public class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public double calculaBonificacao() {
        return this.salario *= 1.1;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}