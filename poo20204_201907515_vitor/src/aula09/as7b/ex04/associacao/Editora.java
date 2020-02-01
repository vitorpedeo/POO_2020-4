package aula09.as7b.ex04.associacao;

import java.util.List;

/*
  Exercício 4
*/

public class Editora {

    private String razaoSocial;
    private String cnpj;
    private String endereco;
    private List<Livro> livros;

    public Editora(String razaoSocial, String cnpj, String endereco) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionaLivro(Livro l) {
        this.livros.add(l);
    }

    public Livro consultaLivro(Livro l) {
        Livro livroDesejado = null;

        if (this.livros.contains(l)) {
            livroDesejado = l;
        }

        return livroDesejado;
    }

    public void removeLivro(Livro l) {
        this.livros.remove(l);
    }

}