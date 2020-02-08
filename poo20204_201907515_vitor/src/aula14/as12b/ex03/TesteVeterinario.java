package aula14.as12b.ex03;

import aula14.as12b.ex01.Animal;
import aula14.as12b.ex01.Cachorro;
import aula14.as12b.ex01.Cavalo;
import aula14.as12b.ex01.Preguica;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 Exercício 3
*/

public class TesteVeterinario {

    //Testa o método examinar da classe Veterinário
    @Test
    public void testaExaminar() {
        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro();
        animais[1] = new Cavalo();
        animais[2] = new Preguica();

        assertEquals("\nExaminado um(a) Cachorro\n*Latido*", Veterinario.examinar(animais[0]));
        assertEquals("\nExaminado um(a) Cavalo\n*Relinche*", Veterinario.examinar(animais[1]));
        assertEquals("\nExaminado um(a) Preguica\n*Som de Bicho-Preguiça*", Veterinario.examinar(animais[2]));
    }
}
