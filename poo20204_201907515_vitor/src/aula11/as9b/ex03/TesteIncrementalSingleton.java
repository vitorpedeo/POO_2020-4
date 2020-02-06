package aula11.as9b.ex03;

/*
 Exercício 3
*/

public class TesteIncrementalSingleton {
    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i++) {
            IncrementalSingleton inc = IncrementalSingleton.getInstancia();
            System.out.println(inc);
        }
    }
}
