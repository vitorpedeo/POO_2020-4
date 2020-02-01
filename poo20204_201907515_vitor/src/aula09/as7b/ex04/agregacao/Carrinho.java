package aula09.as7b.ex04.agregacao;

import java.util.ArrayList;
import java.util.List;

/*
  Exercício 4
*/

public class Carrinho {

    private int capacidade;
    private String material;
    private List <Produto> produtos;

    public Carrinho(int capacidade, String material) {
        this.capacidade = capacidade;
        this.material = material;
        this.produtos = new ArrayList <Produto> ();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionaProduto(Produto p) {
            produtos.add(p);
    }

    public Produto consultaProduto(Produto p) {
         Produto produtoDesejado = null;

         if (produtos.contains(p)) {
              produtoDesejado = p;
         }

         return produtoDesejado;
    }

    public void removeProduto(Produto p) {
         produtos.remove(p);
    }
}