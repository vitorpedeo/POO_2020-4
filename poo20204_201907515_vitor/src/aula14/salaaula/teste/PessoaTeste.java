package aula14.salaaula.teste;

import aula03.as3b.ex01.Pessoa;
import org.junit.Before;
import org.junit.Test;
import util.ConverteData;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PessoaTeste {

    private Pessoa pessoa;

    @Before
    public void setup() {
        pessoa = new Pessoa();
    }

    @Test
    public void testaIdade() {
        pessoa.setNome("Juvenal");
        pessoa.setAltura(1.85);
        try {
            pessoa.setDataNascimento(ConverteData.convertStringToDate("20/10/2000"));
        } catch (ParseException e) {
            e.getMessage();
        }
        assertTrue(pessoa.calculaIdade() == 19);
    }
}
