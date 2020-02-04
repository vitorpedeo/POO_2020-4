package aula11.salaaula.factory_method.mensagem;

public class EmissorCreator {
     public Emissor decideEmissor(String emissor) {
          if (emissor.equalsIgnoreCase("SMS")) {
             return new EmissorSMS();
          } else
          if (emissor.equalsIgnoreCase("JMS")) {
             return new EmissorJMS();
          } else 
          if (emissor.equalsIgnoreCase("EMAIL")) {
             return new EmissorEmail();
          } else {
              throw new IllegalArgumentException("Inválido!");
          }
     }
}