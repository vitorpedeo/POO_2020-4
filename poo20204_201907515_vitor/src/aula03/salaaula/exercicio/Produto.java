package aula03.salaaula.exercicio;

public class Produto {

    private String nomeProduto;
    private double tamanho;
    private String tipo;
    private String cor;
    private String especificacao;

    public void setNomeProduto(String np) {
        this.nomeProduto = np;
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public void setTamanho(double t) {
        this.tamanho = t;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setTipo(String ti) {
        this.tipo = ti;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public String getCor() {
        return this.cor;
    }

    public void setEspecificacao(String e) {
        this.especificacao = e;
    }

    public String getEspecificacao() {
        return this.especificacao;
    }

}