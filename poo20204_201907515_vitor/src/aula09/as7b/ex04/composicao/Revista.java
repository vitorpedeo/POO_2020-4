package aula09.as7b.ex04.composicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
  Exercício 4
*/

public class Revista {

    private String nome;
    private String assunto;
    private Date dataPublicacao;
    private String editora;
    private int numeroPaginas;
    private List<Edicao> edicoes;

    public Revista(String nome, String assunto, Date dataPublicacao, String editora, int numeroPaginas) {
        this.nome = nome;
        this.assunto = assunto;
        this.dataPublicacao = dataPublicacao;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
        this.edicoes = new ArrayList<Edicao>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public List<Edicao> getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(List<Edicao> edicoes) {
        this.edicoes = edicoes;
    }

    public void adicionaEdicao(Edicao e) {
        this.edicoes.add(e);
    }

    public Edicao consultaEdicao(Edicao e) {
        Edicao edicaoDesejada = null;

        if (this.edicoes.contains(e)) {
            edicaoDesejada = e;
        }

        return edicaoDesejada;
    }

    public void removeEdicao(Edicao e) {
        this.edicoes.remove(e);
    }
}