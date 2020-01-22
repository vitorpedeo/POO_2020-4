package aula03.as3b.ex04;

import java.util.ArrayList;
import java.util.List;

/*
  Exercício 4
*/

public class Televisao {

    private List<String> canais = new ArrayList<String>();
    private int volumeAtual;
    private int canalAtual;

    public List<String> getCanais() {
        return canais;
    }

    public void setCanais(List<String> canais) {
        this.canais = canais;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public void liga() {
        canais.add("Globo");
        canais.add("Record");
        canais.add("SBT");
        canais.add("Band");
        canais.add("RedeTV");

        this.volumeAtual = 0;
        this.canalAtual = 0;

        System.out.println("\nTelevisão ligada!");
        System.out.println("Canais disponíveis:");
        for (String c : this.getCanais()) {
            System.out.println(c);
        }
    }

    public void status() {
        System.out.println("\nCanal atual: " + canais.get(this.getCanalAtual()));
        System.out.println("Volume atual: " + this.volumeAtual);
    }

}