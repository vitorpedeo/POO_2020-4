package aula09.as7b.ex04.heranca;

import java.util.Date;

/*
  Exercício 4
*/

public class NaoPerecivel extends Produto {
      public NaoPerecivel(String nome, Date dataValidade, Date dataFabricacao, int lote, String fabricante, String tipo) {
          super(nome, dataValidade, dataFabricacao, lote, fabricante, tipo);
          this.setProdutoVencido(false);
      }
}