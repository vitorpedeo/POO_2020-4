package aula12.salaaula.state;

public class PortaFechada implements EstadosPorta {
    @Override
    public void abrir(Porta p) {
       p.setEstadoAtual(new PortaAberta());
    }

    @Override
    public void fechar(Porta p) {
        System.out.println("Já está fechada!");
    }

    @Override
    public void trancar(Porta p) {
        p.setEstadoAtual(new PortaTrancada());
    }

    @Override
    public void destrancar(Porta p) {
        System.out.println("Porta fechada, mas não trancada!");
    }
}
