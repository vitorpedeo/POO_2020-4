package aula03.salaaula.exercicio;

public class Produto {

    private String nomeProduto;
    private double tamanho;
    private String tipo;
    private String cor;
    private String especificacao;

    public Produto(String nomeProduto, double tamanho, String tipo, String cor, String especificacao) {
        setNomeProduto(nomeProduto);
        setTamanho(tamanho);
        setTipo(tipo);
        setCor(cor);
        setEspecificacao(especificacao);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - Tamanho: %.2f - Tipo: %s - Cor: %s - Especificação: %s", nomeProduto, tamanho,
                tipo, cor, especificacao);
    }

}