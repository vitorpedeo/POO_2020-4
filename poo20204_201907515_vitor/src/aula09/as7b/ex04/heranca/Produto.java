package aula09.as7b.ex04.heranca;

import java.util.Calendar;
import java.util.Date;

/*
  Exercício 4
*/

public class Produto {

    private String nome;
    private Date dataValidade;
    private Date dataFabricacao;
    private int lote;
    private String fabricante;
    private String tipo;
    private boolean produtoVencido;

    public Produto() {

    }

    public Produto(String nome, Date dataValidade, Date dataFabricacao, int lote, String fabricante, String tipo) {
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.dataFabricacao = dataFabricacao;
        this.lote = lote;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.produtoVencido = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isProdutoVencido() {
        return produtoVencido;
    }

    public void setProdutoVencido(boolean produtoVencido) {
        this.produtoVencido = produtoVencido;
    }

    public void verificarValidade() {
        Date hoje = Calendar.getInstance().getTime();

        if (this.getDataValidade().after(hoje)) {
            System.out.println("Produto Vencido!");
            this.setProdutoVencido(true);
        } else {
            System.out.println("Produto na Validade!");
        }
    }

}