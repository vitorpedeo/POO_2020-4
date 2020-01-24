package aula04.as4b.ex03;

/*
  Exercício 3
*/

public class Caixa extends Funcionario {
    protected int horario;

    public Caixa(String nome, String telefone, int matricula, double salario, int horario) {
        super(nome, telefone, matricula, salario);
        this.horario = horario;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String toString() {
        return super.toString() + String.format("\nHoras de trabalho: %d horas\nRecebimento Anual: R$%.2f\n", this.getHorario(), this.recebimentoAnual());
    }
}