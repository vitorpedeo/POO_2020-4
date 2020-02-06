package aula11.as9b.ex03;

/*
 Exercício 3
*/

public class IncrementalSingleton {

    private static IncrementalSingleton instancia;
    private static int count = 0;
    private int numero;

    private IncrementalSingleton() {
        numero = ++count;
    }

    public String toString() {
        return "Incremental " + numero;
    }

    public static IncrementalSingleton getInstancia() {
        if (instancia == null) {
            instancia = new IncrementalSingleton();
        }
        return instancia;
    }
}
