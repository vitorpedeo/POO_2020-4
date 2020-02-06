package aula12.salaaula.adapter;

public class TomadaTeste {
    public static void main(String[] args) {
        TomadaTresPinos t3 = new TomadaTresPinos();
        TomadaDoisPinos t2 = new TomadaAdapter(t3);
        t2.ligarNaTomadaDoisPinos();
    }
}
