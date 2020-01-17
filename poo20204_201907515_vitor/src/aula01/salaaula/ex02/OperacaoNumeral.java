package aula01.salaaula.ex02;

public class OperacaoNumeral {
     int numero1;
     int numero2;

     int numerosIntervalo(int numero1, int numero2) {
          return Math.abs(numero1 - numero2) - 1;
     }

     int[] defineMaiorMenor (int numero1, int numero2) {
          int[] vector = new int[2];
  
            if (numero1 > numero2) {
                vector[0] = numero1;
                vector[1] = numero2;
            }else{
                 vector[0] = numero2;
                 vector[1] = numero1;
            }
              return vector;
       }

     int somaIntervalo(int numero1, int numero2) {
          int[] vector = defineMaiorMenor(numero1, numero2);

          int aux = vector[1] + 1;
          int soma = 0;

          while (aux < vector[0]) {
               soma += aux;
               aux++;
          }
          return soma;
     }

     double mediaIntervalo(int numero1, int numero2) {
          return (double)somaIntervalo(numero1, numero2) / numerosIntervalo(numero1, numero2);
     }

     int[] imparParIntervalo (int numero1, int numero2) {
          int[] v = defineMaiorMenor(numero1, numero2);
          int[] parOuImpar = new int[2];
          parOuImpar[0] = 0;
          parOuImpar[1] = 0;
         
          int aux = v[1] + 1;

          while (aux < v[0]) {
              if (aux % 2 == 0) {
                  parOuImpar[0]++;
              }else{
                  parOuImpar[1]++; 
              }
              aux++;
          }
          return parOuImpar;
     }
}