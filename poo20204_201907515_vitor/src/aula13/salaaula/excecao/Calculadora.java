package aula13.salaaula.excecao;

public class Calculadora {

    public int dividir(int numerador, int denominador) throws ArithmeticException{
         return numerador/denominador;
    }

    public int somar(int[] numeros) {
         int tamanho = numeros.length;
         int soma = 0;
         for (int i = 0 ; i < tamanho ; i++) {
             soma += numeros[i];
         }
         return soma;
    }

    public int multiplicar(int a, int b) throws MinhaExcecao {
        int result = 0;

        if (a == 0 || b == 0) {
            throw new MinhaExcecao("Esta operação não aceita Zeros");
        } else {
            result = a * b;
        }

        return result;
    }
}
