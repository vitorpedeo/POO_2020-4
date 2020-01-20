package aula01.as1c.ex04;

/*
  Exercício 4
*/

public class Contato {
  String nome;
  String telefone;

  public void setNome(String n) {
    this.nome = n;
  }

  public void setTelefone(String t) {
    this.telefone = t;
  }

  public String getNome() {
    return this.nome;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public boolean valida() {
    int i;

    for (i = 0; i < this.nome.length(); i++) {
      if (Character.isDigit(this.nome.charAt(i))) {
        return false;
      }
    }

    for (i = 0; i < this.telefone.length(); i++) {
      if (!Character.isDigit(this.telefone.charAt(i))) {
        return false;
      }
    }
    return true;
  }

}