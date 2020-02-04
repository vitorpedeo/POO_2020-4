package aula11.salaaula.singleton;

public class Conta {

    Banco banco;
    int codigo;
    String nome;

    public Conta(int codigo, String nome) {
        this.banco = Banco.getInstancia(); 
        this.codigo = codigo;
        this.nome = nome;
    }
}