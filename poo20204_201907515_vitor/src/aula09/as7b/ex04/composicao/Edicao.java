package aula09.as7b.ex04.composicao;

import java.util.Date;

/*
  Exercício 4
*/

public class Edicao {

    private String nome;
    private int numeroEdicao;
    private Date dataPublicacao;
    private Revista revista;

    public Edicao(String nome, int numeroEdicao, Date dataPublicacao, Revista revista) {
        this.nome = nome;
        this.numeroEdicao = numeroEdicao;
        this.dataPublicacao = dataPublicacao;
        this.revista = revista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

}