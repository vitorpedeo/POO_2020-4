package aula11.salaaula.singleton;

public final class Numeracao {

    public static Numeracao instancia;
    private static int cont = 0;
    private int numero = 0;

    private Numeracao() {
        numero = ++cont;
    }

    public static Numeracao getInstancia() {
        if (instancia == null) {
            instancia = new Numeracao();
        }
        return instancia;

    }

    public String toString() {
        return String.format("Numeração: %d", this.numero);
    }
}