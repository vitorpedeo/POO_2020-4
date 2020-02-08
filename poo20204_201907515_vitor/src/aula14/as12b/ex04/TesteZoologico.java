package aula14.as12b.ex04;

import aula14.as12b.ex01.Animal;
import aula14.as12b.ex01.Cachorro;
import aula14.as12b.ex01.Cavalo;
import aula14.as12b.ex01.Preguica;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 Exercício 4
*/

public class TesteZoologico {

    //Testa a identificação de Animais realizada pela classe Zoologico
    @Test
    public void testaIdentificacao() {
        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro();
        animais[1] = new Cavalo();
        animais[2] = new Preguica();

        assertEquals("*Latido*\n*Cachorro correndo*", Zoologico.identificaAnimal(animais[0]));
        assertEquals("*Relinche*\n*Cavalo correndo*", Zoologico.identificaAnimal(animais[1]));
        assertEquals("*Som de Bicho-Preguiça*\nAnimal não consegue correr!", Zoologico.identificaAnimal(animais[2]));
    }
}
