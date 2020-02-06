package aula12.as10b.ex04;

public class ProcessoTeste {
    public static void main(String[] args) {
        Processo p = new Processo();
        p.deferir();
        p.arquivar();

        System.out.println("");

        Processo p1 = new Processo();
        p1.indeferir();
        p1.cancelar();
        p1.arquivar();

        System.out.println("");

        Processo p2 = new Processo();
        p2.cancelar();
        p2.arquivar();

        System.out.println("");
    }
}
