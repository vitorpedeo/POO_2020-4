package aula09.salaaula.exemploconta;

public abstract class Conta {
    protected int numero;
    protected double saldo;
    protected Cliente titular;

    public void sacar(double valor) {
        if (this.saldo <= valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;

    }

    public void transferir(Conta destino, double valor) {
        if (this.saldo <= valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    public abstract boolean validarConta();
}