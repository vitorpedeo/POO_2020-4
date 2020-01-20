package aula02.as2b.ex05;

/*
  Exercício 5
*/

public class Pessoa {
    String nome;
    int idade;
    Pessoa mae;
    Pessoa pai;

    public void setNome (String n) {
        this.nome = n;
    }
    public void setIdade (int i) {
        this.idade = i;
    }
    public void setMae (Pessoa m) {
        this.mae = m;
    }
    public void setPai (Pessoa p) {
        this.pai = p;
    }

    public String getNome () {
        return this.nome;
    }
    public int getIdade () {
        return this.idade;
    }
    public Pessoa getMae () {
        return this.mae;
    }
    public Pessoa getPai () {
        return this.pai;
    }

}