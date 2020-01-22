package aula03.as3b.ex01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
  Exercício 1
*/

public class Pessoa {

    private String nome;
    private Date dataNascimento;
    private double altura;

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("\nNome: %s\nData de Nascimento: %s\nAltura: %.2fcm", nome, sdf.format(dataNascimento),
                altura);
    }

    public int calculaIdade() {
        Calendar hoje = Calendar.getInstance();
        Calendar aniversario = Calendar.getInstance();

        aniversario.setTime(this.dataNascimento);
        int idade = hoje.get(Calendar.YEAR) - aniversario.get(Calendar.YEAR);

        aniversario.add(Calendar.YEAR, idade);

        if (hoje.before(aniversario)) {
            idade--;
        }

        return idade;
    }

}