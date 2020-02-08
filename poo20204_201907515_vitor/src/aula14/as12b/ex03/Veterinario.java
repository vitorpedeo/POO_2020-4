package aula14.as12b.ex03;

import aula14.as12b.ex01.Animal;
import aula14.as12b.ex01.Cachorro;
import aula14.as12b.ex01.Cavalo;
import aula14.as12b.ex01.Preguica;

/*
 Exercício 3
*/

/* Mesma classe relativa a Lista AS8b,
 * com alteração no métodos examinar a
 * fim de facilitar os testes
 */

public class Veterinario {

    public static String examinar(Animal animal) {
        return "\nExaminado um(a) " + animal.getClass().getSimpleName() + "\n" + animal.emitirSom();
    }

    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro();
        animais[1] = new Cavalo();
        animais[2] = new Preguica();

        for (Animal a : animais) {
            System.out.println(examinar(a));
        }
    }
}