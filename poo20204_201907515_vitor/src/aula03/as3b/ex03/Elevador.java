package aula03.as3b.ex03;

/*
  Exercício 3
*/

public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int numeroPessoas;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public void inicializa(int capacidade, int totalAndares) {
        this.setAndarAtual(0);
        this.setNumeroPessoas(0);
        this.setCapacidade(capacidade);
        this.setTotalAndares(totalAndares);
    }

    public boolean entra() {
        if (this.getNumeroPessoas() == this.getCapacidade()) {
            return false;
        } else {
            numeroPessoas++;
            return true;
        }
    }

    public boolean sai() {
        if (this.getNumeroPessoas() == 0) {
            return false;
        } else {
            numeroPessoas--;
            return true;
        }
    }

    public boolean sobe() {
        if (this.getAndarAtual() == this.getTotalAndares()) {
              return false;
        }else{
             andarAtual++;
             return true;
        }
    }
    public boolean desce() {
        if (this.getAndarAtual() == 0) {
             return false;
        }else{
             andarAtual--;
             return true;
        }
    }

}