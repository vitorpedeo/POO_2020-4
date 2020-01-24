package aula06.salaaula.endereco;

public class Endereco {

    private String numero;
    private String complemento;
    private Integer cep;
    private String tipo;
    private Bairro bairro;
    private Logradouro logradouro;

    public Endereco(String numero, String complemento, Integer cep, String tipo, Bairro bairro, Logradouro logradouro) {
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.tipo = tipo;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    public String toString() {
        return String.format(
                "\nImprimindo os dados do Endereço:\nTipo do Endereço: %s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s",
                this.getTipo(), this.getLogradouro().getTipo(), this.getLogradouro().getNome(), this.getNumero(),
                this.getComplemento(), this.getCep(), this.getBairro().getNome(),
                this.getBairro().getMunicipio().getNome(), this.getBairro().getMunicipio().getEstado().getNome(),
                this.getBairro().getMunicipio().getEstado().getPais().getNome());
    }
}