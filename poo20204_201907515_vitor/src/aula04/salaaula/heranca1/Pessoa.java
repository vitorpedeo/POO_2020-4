package aula04.salaaula.heranca1;

public class Pessoa {

    protected String nome;
    protected String endereco;
    protected String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return String.format("Nome da Pessoa: %s\nEndereço: %s\nTelefone: %s\n", this.getNome(), this.getEndereco(),
                this.getTelefone());
    }
}