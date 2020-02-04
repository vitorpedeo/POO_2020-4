package aula11.salaaula.singleton;

public class TestaNumeracao {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Numeracao num = Numeracao.getInstancia();
            System.out.println(num);
        }
    }
}