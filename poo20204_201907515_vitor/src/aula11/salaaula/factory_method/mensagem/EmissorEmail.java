package aula11.salaaula.factory_method.mensagem;

public class EmissorEmail implements Emissor {
    public void envia(String mensagem) {
        System.out.println(mensagem);
        System.out.println("Mensagem enviada por Email!");
    }
}