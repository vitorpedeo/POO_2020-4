package aula12.salaaula.adapter;

public class TomadaAdapter extends TomadaDoisPinos {

    private TomadaTresPinos tomadaTresPinos;

     public TomadaAdapter(TomadaTresPinos tomadaTresPinos) {
          this.tomadaTresPinos = tomadaTresPinos;
     }

     public void ligarNaTomadaDoisPinos() {
          tomadaTresPinos.ligarNaTomadaTresPinos();
     }
}
