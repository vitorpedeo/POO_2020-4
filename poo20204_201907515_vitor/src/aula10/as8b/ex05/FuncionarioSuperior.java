package aula10.as8b.ex05;

/*
  Exercício 5 (Itens 5,6 e 9)
*/

public class FuncionarioSuperior extends FuncionarioMedio {

    private String universidade;

    public FuncionarioSuperior(String nome, int codigoFuncional, String escolaBasico, String escolaMedio,
            String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    public FuncionarioSuperior(String nome, int codigoFuncional, String escolaBasico, String escolaMedio,
            Comissao extra, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio, extra);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public double calcularRendaTotal() {
        double rendaTotal = 0;
        rendaTotal = super.calcularRendaTotal() * 2 + getExtra().getAdicional();

        return rendaTotal;
    }

    public String toString() {
        return super.toString();
    }
}