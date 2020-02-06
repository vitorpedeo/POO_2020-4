package aula12.salaaula.state;

public class PortaTrancada implements EstadosPorta {
    @Override
    public void abrir(Porta p) {
        System.out.println("Porta trancada! Destranque-a primeiro");
    }

    @Override
    public void fechar(Porta p) {
        System.out.println("Porta já está fechada e trancada!");
    }

    @Override
    public void trancar(Porta p) {
        System.out.println("Porta já está trancada!");
    }

    @Override
    public void destrancar(Porta p) {
        p.setEstadoAtual(new PortaDestrancada());
    }
}
