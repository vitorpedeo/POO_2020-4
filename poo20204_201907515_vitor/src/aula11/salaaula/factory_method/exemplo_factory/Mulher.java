package aula11.salaaula.factory_method.exemplo_factory;

public class Mulher extends Pessoa {

    public Mulher(String nome) {
       this.nome = nome;
       this.sexo = "Feminino";
       System.out.println("Olá, Sra. " + this.nome);
    }
}