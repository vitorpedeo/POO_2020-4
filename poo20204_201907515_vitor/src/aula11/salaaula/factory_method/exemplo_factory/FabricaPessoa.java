package aula11.salaaula.factory_method.exemplo_factory;

public class FabricaPessoa extends Fabrica {

    public Pessoa criaPessoa(String nome, String sexo) {
        if (sexo.equals("M")) {
            return new Homem(nome);
        } else {
            return new Mulher(nome);
        }
    }
}