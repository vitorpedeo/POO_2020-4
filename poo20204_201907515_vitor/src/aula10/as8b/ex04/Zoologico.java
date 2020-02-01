package aula10.as8b.ex04;

import aula10.as8b.ex01.Animal;
import aula10.as8b.ex01.Cachorro;
import aula10.as8b.ex01.Cavalo;
import aula10.as8b.ex01.Preguica;

public class Zoologico {

    public static void main(String[] args) {
        Animal[] jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Jubileu", 12);
        jaulas[1] = new Cachorro("Lana", 8);
        jaulas[2] = new Cachorro("Marrakesh", 5);
        jaulas[3] = new Cachorro("Praga", 6);
        jaulas[4] = new Cavalo("Azalão", 5);
        jaulas[5] = new Cavalo("Turvante", 7);
        jaulas[6] = new Cavalo("Raio Amarelo", 4);
        jaulas[7] = new Preguica("Zoião", 30);
        jaulas[8] = new Preguica("Cabecinha", 15);
        jaulas[9] = new Preguica("Madrid", 35);

        for (Animal a : jaulas) {
              System.out.println("");
              System.out.println("Nome do Animal: " + a.getNome());
              a.emitirSom();
              
              if (a instanceof Cachorro) {
                  ((Cachorro) a).correr();
              } else
              if (a instanceof Cavalo) {
                  ((Cavalo) a).correr();  
              } else {
                  System.out.println("Animal não consegue correr!");
              }
              System.out.println("");
        }
        
    }
}