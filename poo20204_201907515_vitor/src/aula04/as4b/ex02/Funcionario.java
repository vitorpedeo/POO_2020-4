package aula04.as4b.ex02;

public class Funcionario {

    private String nome;
    private String cpf;
    private int matricula;
    private String cargo;
    private double salario;
    private String departamento;
    private Endereco endereco;

    public Funcionario(String nome, String cpf, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double aumentaSalario(double porcentagemAumento) {
        double novoSalario = this.getSalario();
        novoSalario *= 1 + porcentagemAumento / 100;
        return novoSalario;
    }

    public void mostraDados() {
        System.out.println(this.getMatricula() + " - " + this.getCpf() + " - " + this.getNome() + " - Departamento : "
                + this.getDepartamento() + " - Cargo : " + this.getCargo() + " - Salário : " + this.getSalario());
    }

}