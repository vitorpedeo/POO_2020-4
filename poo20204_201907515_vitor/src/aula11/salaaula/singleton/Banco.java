package aula11.salaaula.singleton;

public final class Banco {

   public static Banco instancia;   
   int codigo;
   String nome;

   private Banco() {
       this.codigo = 001;
       this.nome = "Banco do Brasil S/A.";
   }

   public static Banco getInstancia() {
       if (instancia == null) {
           return new Banco();
       } else {
           return instancia;
       }
   }
}