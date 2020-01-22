package aula04.salaaula.associacao;

import java.util.List;

public class ContaBancaria {

    int numero;
    double saldo;
    double limite;
    String tipo;
    List <Cliente> titulares;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List <Cliente> getTitulares() {
        return titulares;
    }

    public void setTitulares(List <Cliente> titulares) {
        this.titulares = titulares;
    }

    
}