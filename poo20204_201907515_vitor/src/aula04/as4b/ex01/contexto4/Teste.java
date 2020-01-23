package aula04.as4b.ex01.contexto4;

public class Teste {
    public static void main(String[] args) {
        Endereco en1 = new Endereco("Americano", 1, "QD40", 12345000, "Setor Franco", "Goiacetuba", "Goiás");
        Empresa em1 = new Empresa("123456/0001-90", "Dr Imports", en1);
        Empregado emp1 = new Empregado("Vitoriano Pinheiro", 121, em1);
        System.out.println(emp1);

        Endereco en2 = new Endereco("Bráz da Costa", 8, "LT5", 54321000, "Arraial", "Palmada", "Tocantins");
        Empresa em2 = new Empresa("654321/0001-10", "New Sups", en2);
        Empregado emp2 = new Empregado("Silva e Costa", 221, em2);
        System.out.println(emp2);

        Endereco en3 = new Endereco("Colombo", 24, "LT9", 58421000, "Setor Ametista", "Riotisma", "Rio");
        Empresa em3 = new Empresa("123456/0001-90", "Old Soft", en3);
        Empregado emp3 = new Empregado("Mariano Olgos", 882, em3);
        System.out.println(emp3);
    }
}