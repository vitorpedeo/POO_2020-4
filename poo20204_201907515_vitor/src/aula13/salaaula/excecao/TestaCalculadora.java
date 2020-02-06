package aula13.salaaula.excecao;

public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        try{
            System.out.println("Divisão: " + app.dividir(10,0));
        }catch(ArithmeticException e){
            System.out.println("Denominador igual a zero!");
        }

        int[] numeros = new int[] {1,2,3,4,5};
        System.out.println("Soma do vetor: " + app.somar(numeros));

        try {
            System.out.println("Multiplicação: " + app.multiplicar(0,5));
        } catch (MinhaExcecao minhaExcecao) {
            System.out.println(minhaExcecao.getMessage());
        }
    }
}
