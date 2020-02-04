package aula11.salaaula.factory_method.mensagem;

public class TestaEmissor {
    public static void main(String[] args) {
        String mensagem = "Teste de Envio de Mensagens";
        EmissorCreator factory = new EmissorCreator();
        Emissor emissor = factory.decideEmissor("SMS");
        emissor.envia(mensagem);

        //Outro meio de utilização!
        //Emissor emissor = new EmissorCreator().decideEmissor("SMS");
        //emissor.envia(mensagem);

        //Funcionando normalmente usando apenas uma linha!
        //new EmissorCreator().decideEmissor("SMS").envia(mensagem);
        //new EmissorCreator().decideEmissor("JMS").envia(mensagem);
        //new EmissorCreator().decideEmissor("EMAIL").envia(mensagem);

    }
}