package aula04.as4b.ex01.contexto2;

public class Teste {
    public static void main(String[] args) {
        Departamento d1 = new Departamento("Instituto de Informática", "INF");
        Curso c1 = new Curso("Sistemas de Informação", "SI", d1);
        Aluno a1 = new Aluno("Vitor Pereira de Oliveira", 201907515, 2020, c1);
        System.out.println(a1);

        Departamento d2 = new Departamento("Instituto de Informática", "INF");
        Curso c2 = new Curso("Engenharia de Software", "ES", d2);
        Aluno a2 = new Aluno("Bruce Dickinson", 201545622, 2020, c2);
        System.out.println(a2);

        Departamento d3 = new Departamento("Escola de Música e Artes Cênicas", "EMAC");
        Curso c3 = new Curso("Artes Cênicas", "AC", d3);
        Aluno a3 = new Aluno("Maria das Dores", 201712588, 2020, c3);
        System.out.println(a3);
       
    }
}