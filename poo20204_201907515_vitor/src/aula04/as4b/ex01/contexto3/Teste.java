package aula04.as4b.ex01.contexto3;

public class Teste {
    public static void main(String[] args) {
        Endereco e1 = new Endereco("Rua JJ", 45, "QD16 LT20", 85369000, "Velha Morada", "Governador Canedo", "Goiás");
        Cliente c1 = new Cliente("Joao Costa e Silva", "12345678900", e1);
        System.out.println(c1);

        Endereco e2 = new Endereco("Rua Costinha", 10, "QD10 LT5", 54321000, "Setor Ricoz", "Nova Mundana",
                "Tocantins");
        Cliente c2 = new Cliente("Maria Aparecida", "98765432100", e2);
        System.out.println(c2);

        Endereco e3 = new Endereco("Rua deJesus", 5, "QD6 LT2", 15872000, "Rio Negro", "Rio Branco",
                "Rio Grande do Norte");
        Cliente c3 = new Cliente("Homem Pereira", "58947523100", e3);
        System.out.println(c3);
    }
}