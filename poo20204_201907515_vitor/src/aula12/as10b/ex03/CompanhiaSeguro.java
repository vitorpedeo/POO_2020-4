package aula12.as10b.ex03;

/*
 Exercício 3
*/

public class CompanhiaSeguro implements Observer {

    private Subject sistemaSeguranca;

    public CompanhiaSeguro(Subject sistemaSeguranca) {
        this.sistemaSeguranca = sistemaSeguranca;
        sistemaSeguranca.registerObserver(this);
    }

    @Override
    public void update(String texto) {
        System.out.println("\nAlerta recebido");
        System.out.println(texto);
        System.out.println("Acionando seguro...");
    }
}
