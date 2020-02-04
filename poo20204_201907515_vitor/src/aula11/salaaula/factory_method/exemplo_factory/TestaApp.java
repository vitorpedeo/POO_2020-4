package aula11.salaaula.factory_method.exemplo_factory;

public class TestaApp {
    public static void main(String[] args) {
        FabricaPessoa factory = new FabricaPessoa();
        Pessoa pessoa1 = factory.criaPessoa("Vitor", "M");

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Sexo: " + pessoa1.sexo + "\n");

        Pessoa pessoa2 = factory.criaPessoa("Martha", "F");
        
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Sexo: " + pessoa2.sexo + "\n");
    }
}