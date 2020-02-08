package aula10.as8b.ex05;

/*
  Exercício 5 (Item 7)
*/

/*Comentário adicionado em 08/02/2020
* Para que esse método funcione, basta comentar
* a parte que se refere a comissão no método
* calcularRendaTotal(), que foi modificado
* a fim de testar a funcionalidade das
* comissões.
*/

public class Teste {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new FuncionarioBasico("Juvenal Juvêncio", 1220, "Colégio Apoio");
        funcionarios[1] = new FuncionarioBasico("Vitoriano da Costa", 1221, "Colégio Decisão");
        funcionarios[2] = new FuncionarioBasico("Maria das Dores", 1222, "Colégio Pintando o 7");
        funcionarios[3] = new FuncionarioBasico("Francisca Aparecida", 1223, "Escola Mundial");
        funcionarios[4] = new FuncionarioMedio("Tiago Maranhão", 1224, "Colégio Inter", "Colégio Inter");
        funcionarios[5] = new FuncionarioMedio("Mariana de Jesus", 1225, "Colégio Decisão", "Colégio Decisão");
        funcionarios[6] = new FuncionarioMedio("Dionatan Negrão", 1226, "Escola Barba Rossa", "Escola Barba Rossa");
        funcionarios[7] = new FuncionarioMedio("Lorenza Olivier", 1227, "Escola Mundial", "Escola Barba Rossa");
        funcionarios[8] = new FuncionarioSuperior("Teobaldo Pereira", 1228, "Colégio Inter", "Escola Barba Rossa",
                "UFDP");
        funcionarios[9] = new FuncionarioSuperior("Jeovana Silva", 1229, "Colégio Pintando o 7", "Colégio Decisão",
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

        System.out.println("\n----------------------");
        System.out.println("GASTO SALARIAL TOTAL");
        System.out.println(gastoSalarialBasico + gastoSalarialMedio + gastoSalarialSuperior);
        System.out.println("----------------------");

        System.out.println("\n-----------------------");
        System.out.println("GASTO POR NÍVEL ESCOLAR");
        System.out.println("NÍVEL BÁSICO: " + gastoSalarialBasico);
        System.out.println("NÍVEL MÉDIO: " + gastoSalarialMedio);
        System.out.println("NÍVEL SUPERIOR: " + gastoSalarialSuperior);
        System.out.println("-----------------------\n");
    }
}