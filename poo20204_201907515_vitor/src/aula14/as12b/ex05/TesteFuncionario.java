package aula14.as12b.ex05;

/*
 Exercício 5
*/

import aula10.as8b.ex05.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteFuncionario {

    //Testa os construtores de todas as classes que extendem Funcionario
    @Test
    public void testaClasses() {
        FuncionarioBasico funcBasico = new FuncionarioBasico("João das Pregas", 120,
                "Escola Cômodo");
        FuncionarioMedio funcMedio = new FuncionarioMedio("Maria Dolores", 121,
                "Colégio AI5", "Colégio AI6");
        FuncionarioSuperior funcSuperior = new FuncionarioSuperior("Cristian Costa", 122,
                "Escola Mundial", "Colégio Opção", "UFO");

        assertTrue(funcBasico.getNome() == "João das Pregas" && funcBasico.getCodigoFuncional() == 120
                && funcBasico.getEscolaBasico() == "Escola Cômodo");
        assertTrue(funcMedio.getNome() == "Maria Dolores" && funcMedio.getCodigoFuncional() == 121
                && funcMedio.getEscolaBasico() == "Colégio AI5" && funcMedio.getEscolaMedio() == "Colégio AI6");
        assertTrue(funcSuperior.getNome() == "Cristian Costa" && funcSuperior.getCodigoFuncional() == 122
                && funcSuperior.getEscolaBasico() == "Escola Mundial" && funcSuperior.getEscolaMedio() ==
                "Colégio Opção" && funcSuperior.getUniversidade() == "UFO");
    }

    //Testa a renda básica de cada nível de Funcionario criado
    @Test
    public void testaRendaBasica() {
        FuncionarioBasico funcBasico = new FuncionarioBasico("João das Pregas", 120,
                "Escola Cômodo");
        FuncionarioMedio funcMedio = new FuncionarioMedio("Maria Dolores", 121,
                "Colégio AI5", "Colégio AI6");
        FuncionarioSuperior funcSuperior = new FuncionarioSuperior("Cristian Costa", 122,
                "Escola Mundial", "Colégio Opção", "UFO");

        /*O método para calcular a renda total será testado mais adiante,
         * por isso fiz manualmente o cálculo.
         */
        assertEquals(1100, funcBasico.getRendaBasica() * 1.1);
        assertEquals(1650, funcMedio.getRendaBasica() * 1.1 * 1.5);
        assertEquals(3300, funcSuperior.getRendaBasica() * 1.1 * 1.5 * 2);
    }

    //Testa as comissões criadas
    @Test
    public void testaComissao() {
        Vendedor vendedor = new Vendedor();
        Supervisor supervisor = new Supervisor();
        Gerente gerente = new Gerente();

        assertEquals(250, vendedor.getAdicional());
        assertEquals(600, supervisor.getAdicional());
        assertEquals(1500, gerente.getAdicional());
    }

    //Testa o gasto salarial total da empresa (utilizando 10 Funcionários)
    @Test
    public void testaGastoTotal() {
        Funcionario[] funcionarios = new Funcionario[10];
        Vendedor v = new Vendedor();
        Supervisor s = new Supervisor();
        Gerente g = new Gerente();

        funcionarios[0] = new FuncionarioBasico("Juvenal Juvêncio", 1220, "Colégio Apoio", v);
        funcionarios[1] = new FuncionarioBasico("Vitoriano da Costa", 1221, "Colégio Decisão", v);
        funcionarios[2] = new FuncionarioBasico("Maria das Dores", 1222, "Colégio Pintando o 7", v);
        funcionarios[3] = new FuncionarioBasico("Francisca Aparecida", 1223, "Escola Mundial", v);
        funcionarios[4] = new FuncionarioMedio("Tiago Maranhão", 1224, "Colégio Inter", "Colégio Inter", v);
        funcionarios[5] = new FuncionarioMedio("Mariana de Jesus", 1225, "Colégio Decisão", "Colégio Decisão", v);
        funcionarios[6] = new FuncionarioMedio("Dionatan Negrão", 1226, "Escola Barba Rossa", "Escola Barba Rossa", v);
        funcionarios[7] = new FuncionarioMedio("Lorenza Olivier", 1227, "Escola Mundial", "Escola Barba Rossa", s);
        funcionarios[8] = new FuncionarioSuperior("Teobaldo Pereira", 1228, "Colégio Inter", "Escola Barba Rossa", g,
                "UFDP");
        funcionarios[9] = new FuncionarioSuperior("Jeovana Silva", 1229, "Colégio Pintando o 7", "Colégio Decisão", s,
                "UFDP");

        double gastoSalarialBasico = 0;
        double gastoSalarialMedio = 0;
        double gastoSalarialSuperior = 0;

        for (Funcionario f : funcionarios) {
            if (f instanceof FuncionarioSuperior) {
                gastoSalarialSuperior += ((FuncionarioSuperior) f).calcularRendaTotal();
            } else if (f instanceof FuncionarioMedio) {
                gastoSalarialMedio += ((FuncionarioMedio) f).calcularRendaTotal();
            } else if (f instanceof FuncionarioBasico) {
                gastoSalarialBasico += ((FuncionarioBasico) f).calcularRendaTotal();
            }

        }
        assertEquals(34575,gastoSalarialBasico + gastoSalarialMedio + gastoSalarialSuperior);
    }
}
