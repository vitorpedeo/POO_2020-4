package aula14.salaaula.teste;

import aula03.as3b.ex02.Agenda;
import aula03.as3b.ex02.Pessoa;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestaAgenda {

    Agenda agenda;

    @Before
    public void setup() {
        agenda = new Agenda();
    }

    @Test
    public void testaAdicaoPessoa() {
        agenda.armazenaPessoa("Juvêncio",35,1.75);
        agenda.armazenaPessoa("Cabrunco",45,1.65);
        agenda.armazenaPessoa("Ronalda",25,1.70);
        assertTrue(agenda.getContatos().size() == 3);
    }

    @Test
    public void testaRemocaoPessoa() {
        agenda.armazenaPessoa("Juvêncio",35,1.75);
        agenda.armazenaPessoa("Cabrunco",45,1.65);
        agenda.armazenaPessoa("Ronalda",25,1.70);
        agenda.removePessoa("Cabrunco");
        assertTrue(agenda.getContatos().size() == 2);
    }

    @Test
    public void testaConsultaPessoa() {
        agenda.armazenaPessoa("Juvêncio",35,1.75);
        agenda.armazenaPessoa("Cabrunco",45,1.65);
        agenda.armazenaPessoa("Ronalda",25,1.70);

        Pessoa p = agenda.getContatos().get(2);

        assertTrue(p.getIdade() == 25);
    }
}
