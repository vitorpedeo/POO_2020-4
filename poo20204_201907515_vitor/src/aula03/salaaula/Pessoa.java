package aula03.salaaula;

import java.util.Date;

public class Pessoa {
    //Atributos
    private String nome;
    private Date dataNascimento;
    public final String especie = "Mamífero";

    //Métodos
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDataNascimento(Date dn) {
        this.dataNascimento = dn;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

}