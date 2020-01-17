package aula01.salaaula.ex01;

public class Aluno {

      String nome;
      double nota1;
      double nota2;
      double nota3;
      double media;
      
   double calculaMedia (double nota1, double nota2, double nota3) {
	   return (this.nota1 + this.nota2 + this.nota3)/3;
   }

}
