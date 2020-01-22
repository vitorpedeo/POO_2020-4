package aula03.as3b.ex04;

/*
  Exercício 4
*/

public class ControleRemoto {

    private Televisao tv;

    public Televisao getTv() {
        return tv;
    }

    public void setTv(Televisao tv) {
        this.tv = tv;
    }

    public void trocaVolume(String decisao) {
        if(decisao.equalsIgnoreCase("+")){
        this.tv.setVolumeAtual(this.tv.getVolumeAtual() + 1);
        }else{
            this.tv.setVolumeAtual(this.tv.getVolumeAtual() - 1);   
        }
    }

    public void mudaCanal() {
        this.tv.setCanalAtual(this.tv.getCanalAtual() + 1);
    }

    public void trocaCanal(String nomeCanal) {
       for (int i = 0 ; i < this.tv.getCanais().size() ; i++) {
            if (nomeCanal.equalsIgnoreCase(this.tv.getCanais().get(i))) {
                  this.tv.setCanalAtual(i);
            } 
       }
    }

    public void status() {
        System.out.println("\nCanal atual: " + this.tv.getCanais().get(this.tv.getCanalAtual()));
        System.out.println("Volume atual: " + this.tv.getVolumeAtual() + "\n");
    }
}