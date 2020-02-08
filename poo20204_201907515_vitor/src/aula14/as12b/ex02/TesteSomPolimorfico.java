package aula14.as12b.ex02;

import aula14.as12b.ex01.Animal;
import aula14.as12b.ex01.Cachorro;
import aula14.as12b.ex01.Cavalo;
import aula14.as12b.ex01.Preguica;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 Exercício 2
*/

public class TesteSomPolimorfico {

    //Testa o método emitirSom em cada Animal
    @Test
    public void testaSom() {
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro();
        animais[1] = new Cavalo();
        animais[2] = new Preguica();

        assertEquals("*Latido*",animais[0].emitirSom());
        assertEquals("*Relinche*", animais[1].emitirSom());
        assertEquals("*Som de Bicho-Preguiça*", animais[2].emitirSom());
    }
}
