package aula10.as8b.ex05;

/*
  Exercício 5 (Itens 5,6 e 9)
*/

public class FuncionarioBasico extends Funcionario {

    private String escolaBasico;
    private Comissao extra;

    public FuncionarioBasico(String nome, int codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }

    public FuncionarioBasico(String nome, int codigoFuncional, String escolaBasico, Comissao extra) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
        this.extra = extra;
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    public void setEscolaBasico(String escolaBasico) {
        this.escolaBasico = escolaBasico;
    }

    public Comissao getExtra() {
        return extra;
    }

    public void setExtra(Comissao extra) {
        this.extra = extra;
    }

    public double calcularRendaTotal() {
        double rendaTotal = 0;
        rendaTotal = super.getRendaBasica() * 1.1 + getExtra().getAdicional();

        return rendaTotal;
    }

    public String toString() {
        return String.format("Nome: %s - Comissão: %.2f - Salário: %.2f",
                this.getNome(), this.getExtra().getAdicional(), this.calcularRendaTotal());
    }
}