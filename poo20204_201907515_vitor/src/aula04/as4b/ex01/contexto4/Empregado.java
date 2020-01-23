package aula04.as4b.ex01.contexto4;

public class Empregado {

    private String nome;
    private int matricula;
    private Empresa empresa;

    public Empregado(String nome, int matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String toString() {
        return String.format("\nNome do Empregado: %s\nMatrícula: %d", this.getNome(), this.getMatricula())
                + this.getEmpresa().toString() + this.getEmpresa().getEndereco().toString();
    }

}