package aula10.as8b.ex05;

/*
  Exercício 5 (Itens 10 e 11)
*/

public class TestaComissao {
    public static void main(String[] args) {
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
    
        System.out.println("\n------------------------");
        System.out.println("FUNCIONÁRIOS DA EMPRESA:");
        System.out.println("------------------------\n");
        for (Funcionario f : funcionarios) {
               System.out.println(f);
        }
        System.out.println("");
    }
}