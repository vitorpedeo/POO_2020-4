package aula04.as4b.ex03;

/*
  Exercício 3
*/

public class Funcionario extends Pessoa {

    protected int matricula;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String telefone, int matricula, double salario) {
        super(nome, telefone);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentaSalario(double percentual) {
        this.salario *= 1 + percentual / 100;
    }

    public double recebimentoAnual() {
        return this.salario * 12;
    }

    public String toString() {
        return String.format("\nDados do Funcionário\nNome: %s\nTelefone: %s\nMatrícula: %s\nSalário: R$%.2f",
                this.getNome(), this.getTelefone(), this.getMatricula(), this.getSalario());
    }

}