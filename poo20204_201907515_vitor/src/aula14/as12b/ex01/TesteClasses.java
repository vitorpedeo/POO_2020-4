package aula14.as12b.ex01;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 Exercício 1
*/

public class TesteClasses {

    //Testa construtor, getter, setter e métodos da classe Cachorro
    @Test
    public void TestaCachorro() {
        Cachorro cachorro = new Cachorro("Mutley",10);
        assertTrue(cachorro.getNome() == "Mutley" && cachorro.getIdade() == 10);
        cachorro.setNome("Mozart");
        assertSame("Mozart", cachorro.getNome());
        assertEquals("*Cachorro correndo*", cachorro.correr());
        assertEquals("*Latido*", cachorro.emitirSom());
    }

    //Testa construtor, getter, setter e métodos da classe Cavalo
    @Test
    public void TestaCavalo() {
        Cavalo cavalo = new Cavalo("Azalão",6);
        assertTrue(cavalo.getNome() == "Azalão" && cavalo.getIdade() == 6);
        cavalo.setNome("Imortal");
        assertSame("Imortal", cavalo.getNome());
        assertEquals("*Cavalo correndo*", cavalo.correr());
        assertEquals("*Relinche*", cavalo.emitirSom());
    }

    //Testa construtor, getter, setter e métodos da classe Preguica
    @Test
    public void TestaPreguica() {
        Preguica preguica = new Preguica("Oreia",17);
        assertTrue(preguica.getNome() == "Oreia" && preguica.getIdade() == 17);
        preguica.setNome("Zezinho");
        assertSame("Zezinho", preguica.getNome());
        assertEquals("*Bicho-Preguiça subindo na árvore*", preguica.subirArvore());
        assertEquals("*Som de Bicho-Preguiça*", preguica.emitirSom());
    }
}
