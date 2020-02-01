package aula10.salaaula.exemplo02;

public class Gerente extends Funcionario {

    private int senha;

    public double bonificacao() {
        double b = this.salario * 0.15;
        return b;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}