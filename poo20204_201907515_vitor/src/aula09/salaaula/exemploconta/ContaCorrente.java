package aula09.salaaula.exemploconta;

public class ContaCorrente extends Conta implements Tributavel {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean validarConta() {
        if (this.numero > 100000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double calculaTributos() {
        return this.saldo * 0.01;
    }
}