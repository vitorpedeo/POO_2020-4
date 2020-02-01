package aula09.as7b.ex04.heranca;

import java.util.Date;

/*
  Exercício 4
*/

public class Perecivel extends Produto {
    public Perecivel(String nome, Date dataValidade, Date dataFabricacao, int lote, String fabricante, String tipo) {
        super(nome, dataValidade, dataFabricacao, lote, fabricante, tipo);
        this.setProdutoVencido(false);
    }
}