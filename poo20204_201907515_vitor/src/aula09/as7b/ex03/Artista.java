package aula09.as7b.ex03;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
  Exercício 3
*/

public class Artista implements ImpressaoDeDados {

    private String nome;
    private Date dataNascimento;
    private String localNascimento;

    public Artista(String nome, Date dataNascimento, String localNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.localNascimento = localNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public void imprimirDados() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("*****************************");
        System.out.println("-----Dados do Autor-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + sdf.format(this.getDataNascimento()));
        System.out.println("Local de Nascimento: " + this.getLocalNascimento());
        System.out.println("*****************************");
    }
}