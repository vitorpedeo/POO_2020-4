package aula04.salaaula.heranca1;

public class HerancaTeste {
    public static void main(String[] args) {
        // Importante
        Pessoa pessoa = new Cliente("Josué", "Rua Pedro Ludovico Número 55, Goiânia/GO", "912345678", "12345678900",
                "Masculino", "Solteiro", 5000, "Gerente de TI");

        System.out.println("Dados do Cliente:");
        System.out.println(pessoa);

        // Importante
        if (pessoa instanceof Cliente) {
            Cliente c = (Cliente) pessoa;
            c.adicionaInteresse("Futebol");
            c.adicionaInteresse("Literatura");
            c.adicionaInteresse("Política");
            String algumInteresse = c.consultaInteresse("Futebol");
            if (algumInteresse != null) {
                System.out.println("\n" + algumInteresse + "\n");
            } else {
                System.out.println("\nInteresse não encontrado!\n");
            }

            System.out.println(c.getInteresses().toString());
            c.removeInteresse("Futebol");
            System.out.println(c.getInteresses().toString());
        }
    }
}