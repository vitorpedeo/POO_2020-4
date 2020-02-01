package aula10.as8b.ex02;

import aula10.as8b.ex01.Animal;
import aula10.as8b.ex01.Cachorro;
import aula10.as8b.ex01.Cavalo;
import aula10.as8b.ex01.Preguica;

public class Teste {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro();
        animais[1] = new Cavalo();
        animais[2] = new Preguica();

        for (Animal a : animais) {
            a.emitirSom();
        }

    }
}