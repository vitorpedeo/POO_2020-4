package aula03.salaaula.exercicio;

public class Empresa {

    private String nome;
    private String cnpj;
    private String nomeResponsavel;
    private String telefoneResponsavel;

    public Empresa(String nome, String cnpj, String nomeResponsavel, String telefoneResponsavel) {
        setNome(nome);
        setCnpj(cnpj);
        setNomeResponsavel(nomeResponsavel);
        setTelefoneResponsavel(telefoneResponsavel);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getNomeResponsavel() {
        return this.nomeResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getTelefoneResponsavel() {
        return this.telefoneResponsavel;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - CNPJ: %s - Responsável: %s - Telefone: %s", nome, cnpj, nomeResponsavel,
                telefoneResponsavel);
    }

}