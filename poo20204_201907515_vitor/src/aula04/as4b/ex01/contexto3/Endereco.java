package aula04.as4b.ex01.contexto3;

public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private int cep;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, int numero, String complemento, int cep, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return String.format("\nRua: %s\nNúmero: %d\nComplemento: %s\nCEP: %d\nBairro: %s\nCidade: %s\nEstado: %s\n",
                this.getRua(), this.getNumero(), this.getComplemento(), this.getCep(), this.getBairro(),
                this.getCidade(), this.getEstado());
    }

}