package aula04.as4b.ex03;

/*
  Exercício 3
*/

public class Cliente extends Pessoa {

    protected int idade;
    protected String cpf;
    protected String status;

    public Cliente(String nome, String telefone, int idade, String cpf) {
        super(nome, telefone);
        this.idade = idade;
        this.cpf = cpf;
        this.status = "A";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void desativa() {
        if (this.getStatus().equalsIgnoreCase("A")) {
            this.setStatus("I");
        } else {
            System.out.println("Cliente já está desativo!");
        }
    }

    public void mostraDados() {
        System.out.println("Nome: " + this.getNome() + " - Telefone: " + this.getTelefone() + " - Idade: " + this.getIdade() + " anos - CPF: " + this.getCpf() + " - Status: " + this.getStatus());
    }
}