package aula09.as7b.ex02;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
  Exercício 2
*/

public class Obra implements ImpressaoDeDados {

    private String titulo;
    private double preco;
    private Date dataCriacao;
    private String situacao;
    private String tipo;
    private String material;
    private Artista autor;

    Obra() {
        this.situacao = "Disponível";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Artista getAutor() {
        return autor;
    }

    public void setAutor(Artista autor) {
        this.autor = autor;
    }

    public void alterarSituacao() {
        if (this.getSituacao().equals("Vendida")) {
             this.setSituacao("Disponível");
        } else {
             this.setSituacao("Vendida");
        }
    }

    public void imprimirDados() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale l = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);
        System.out.println("\n*****************************");
        System.out.println("*****************************");
        System.out.println("-----Dados da Obra-----");
        System.out.println("Título da Obra: " + this.getTitulo());
        System.out.println("Preço da Obra: " + nf.format(this.getPreco()));
        System.out.println("Data de Criação: " + sdf.format(this.getDataCriacao()));
        System.out.println("Situação: " + this.getSituacao());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Material: " + this.getMaterial());
        this.getAutor().imprimirDados();
        System.out.println("*****************************\n");
    }

}