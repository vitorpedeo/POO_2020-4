package aula04.as4b.ex03;

/*
  Exercício 3
*/

public class Gerente extends Funcionario {

    protected double bonificacaoMensal;
    protected String tipo;

    public Gerente(String nome, String telefone, int matricula, double salario, double bonificacaoMensal, String tipo) {
        super(nome, telefone, matricula, salario);
        this.bonificacaoMensal = bonificacaoMensal;
        this.tipo = tipo;
    }

    public double getBonificacaoMensal() {
        return bonificacaoMensal;
    }

    public void setBonificacaoMensal(double bonificacaoMensal) {
        this.bonificacaoMensal = bonificacaoMensal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double recebimentoAnual() {
        return (this.salario * (1 + this.getBonificacaoMensal() / 100)) * 12;
    }

    public String toString() {
        return super.toString()
                + String.format("\nBonificação Mensal: %.2f%%\nTipo: %s\nRecebimento Anual: R$%.2f\n", this.getBonificacaoMensal(), this.getTipo(), this.recebimentoAnual());
    }

}