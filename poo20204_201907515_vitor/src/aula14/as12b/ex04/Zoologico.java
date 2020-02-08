package aula14.as12b.ex04;

import aula14.as12b.ex01.Animal;
import aula14.as12b.ex01.Cachorro;
import aula14.as12b.ex01.Cavalo;

/*
 Exercício 4
*/

/* Mesma classe referente a Lista AS8b,
 * com mudanças para facilitar o teste
 */

public class Zoologico {

    public static String identificaAnimal(Animal animal) {
        String result;

        if (animal instanceof Cachorro) {
            result = animal.emitirSom() + "\n" + ((Cachorro)animal).correr();
        } else if (animal instanceof Cavalo) {
            result = animal.emitirSom() + "\n" + ((Cavalo)animal).correr();
        } else {
            result = animal.emitirSom() + "\nAnimal não consegue correr!";
        }
        return result;
    }
}
