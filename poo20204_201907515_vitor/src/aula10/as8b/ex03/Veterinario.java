package aula10.as8b.ex03;

import aula10.as8b.ex01.Animal;
import aula10.as8b.ex01.Cachorro;
import aula10.as8b.ex01.Cavalo;
import aula10.as8b.ex01.Preguica;

public class Veterinario {

    public static void examinar(Animal animal) {
        System.out.println("\nExaminado um(a) " + animal.getClass().getSimpleName());
        System.out.println(animal.getClass().getSimpleName() + " está fazendo barulho!");
        animal.emitirSom();
    }

    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro();
        animais[1] = new Cavalo();
        animais[2] = new Preguica();

        for (Animal a : animais) {
             examinar(a);
        }
    }
}