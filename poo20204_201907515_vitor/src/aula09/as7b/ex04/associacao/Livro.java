package aula09.as7b.ex04.associacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
  Exercício 4
*/

public class Livro {

    private String titulo;
    private String genero;
    private Date dataPublicacao;
    private List<Editora> editoras;

    public Livro(String titulo, String genero, Date dataPublicacao) {
        this.titulo = titulo;
        this.genero = genero;
        this.dataPublicacao = dataPublicacao;
        this.editoras = new ArrayList<Editora>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Editora> getEditoras() {
        return editoras;
    }

    public void setEditoras(List<Editora> editoras) {
        this.editoras = editoras;
    }

    public void adicionaEditora(Editora e) {
        this.editoras.add(e);
    }

    public Editora consultaEditora(Editora e) {
        Editora editoraDesejada = null;

        if (this.editoras.contains(e)) {
            editoraDesejada = e;
        }
        return editoraDesejada;
    }

    public void removeEditora(Editora e) {
        this.editoras.remove(e);
    }

}