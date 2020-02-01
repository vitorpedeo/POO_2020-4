package aula10.salaaula.exemplo02;

public class Funcionario {

     protected String nome;
     protected String cpf;
     protected double salario;

     public double getSalario() {
          return salario;
     }

     public void setSalario(double salario) {
          this.salario = salario;
     }

     public double bonificacao() {
          double b = this.salario * 0.10;
          return b;
     }
     
}