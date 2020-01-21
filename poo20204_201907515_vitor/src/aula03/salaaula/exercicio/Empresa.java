package aula03.salaaula.exercicio;

public class Empresa {

    private String nome;
    private String cnpj;
    private String nomeResponsavel;
    private String telefoneResponsavel;

    public void setNome(String n) {
        this.nome = n;
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

    public void setNomeResponsavel(String nr) {
        this.nomeResponsavel = nr;
    }

    public String getNomeResponsavel() {
        return this.nomeResponsavel;
    }

    public void setTelefoneResponsavel(String tr) {
        this.telefoneResponsavel = tr;
    }

    public String getTelefoneResponsavel() {
        return this.telefoneResponsavel;
    }

}