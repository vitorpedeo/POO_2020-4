package aula09.as7b.ex04.agregacao;

/*
  Exercício 4
*/

public class Produto {

    private String nome;
    private String fabricante;
    private String tipo;
    private Carrinho carrinhoCompra;

    public Produto(String nome, String fabricante, String tipo, Carrinho carrinhoCompra) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.carrinhoCompra = carrinhoCompra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Carrinho getCarrinhoCompra() {
        return carrinhoCompra;
    }

    public void setCarrinhoCompra(Carrinho carrinhoCompra) {
        this.carrinhoCompra = carrinhoCompra;
    }

}