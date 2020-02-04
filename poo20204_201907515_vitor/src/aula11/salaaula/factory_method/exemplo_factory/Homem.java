package aula11.salaaula.factory_method.exemplo_factory;

public class Homem extends Pessoa {
    
    public Homem(String nome) {
        this.nome = nome;
        this.sexo = "Masculino";
        System.out.println("Olá, Sr. " + this.nome);
    }
}