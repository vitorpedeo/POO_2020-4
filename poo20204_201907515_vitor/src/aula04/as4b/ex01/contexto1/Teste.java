package aula04.as4b.ex01.contexto1;

/*
  Exercício 1
*/

public class Teste {
    public static void main(String[] args) {
        Compositor c1 = new Compositor ("Tom Jobim","Brasileiro");
        Musica m1 = new Musica("Garota de Ipanema", "MPB", 1977, c1);
        System.out.println(m1);

        Compositor c2 = new Compositor ("Steve Harris","Britânico");
        Musica m2 = new Musica("Hallowed be Thy Name", "Heavy Metal", 1982, c2);
        System.out.println(m2);

        Compositor c3 = new Compositor ("James Hetfield, Cliff Burton, Lars Ulrich, Kirk Hammet","Americanos");
        Musica m3 = new Musica("Fade to Black", "Rock", 1984, c3);
        System.out.println(m3);
        
    }
}