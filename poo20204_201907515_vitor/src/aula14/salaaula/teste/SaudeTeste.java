package aula14.salaaula.teste;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SaudeTeste {

    @Test
    public void testaCondicao() {
        Saude saude = new Saude(25, 1.90, 85.5);
        assertTrue(saude.condicaoFisica().equals("Peso Normal"));
    }

    @Test
    public void testaIMC() {
        Saude saude = new Saude(45,2,120);
        assertEquals(saude.calculaIMC(),30);
    }
}
