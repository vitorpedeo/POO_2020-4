package aula10.as8b.ex05;

/*
  Exercício 5 (Itens 5,6 e 9)
*/

public class FuncionarioMedio extends FuncionarioBasico {

    private String escolaMedio;

    public FuncionarioMedio(String nome, int codigoFuncional, String escolaBasico, String escolaMedio) {
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    public FuncionarioMedio(String nome, int codigoFuncional, String escolaBasico, String escolaMedio, Comissao extra) {
        super(nome, codigoFuncional, escolaBasico, extra);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    public double calcularRendaTotal() {
        double rendaTotal = 0;
        rendaTotal = super.calcularRendaTotal() * 1.5 + getExtra().getAdicional();

        return rendaTotal;
    }

    public String toString() {
        return super.toString();
    }
}