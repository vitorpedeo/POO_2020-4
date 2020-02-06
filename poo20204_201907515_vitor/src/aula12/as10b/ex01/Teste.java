package aula12.as10b.ex01;

/*
 Exercício 1
*/

public class Teste {
    public static void main(String[] args) {
        SomadorAdapter adapter = new SomadorAdapter();
        Cliente cliente = new Cliente(adapter);
        cliente.executar();
    }
}
