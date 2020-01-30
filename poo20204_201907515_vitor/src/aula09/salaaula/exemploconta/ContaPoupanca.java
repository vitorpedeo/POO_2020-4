package aula09.salaaula.exemploconta;

public class ContaPoupanca extends Conta {
    private double juros;

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public boolean validarConta() {
        if (this.numero <= 100000) {
            return true;
        } else {
            return false;
        }
    }
}