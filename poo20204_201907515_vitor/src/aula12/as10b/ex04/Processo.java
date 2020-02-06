package aula12.as10b.ex04;

public class Processo {

    private EstadosProcesso estadoAtual;

    public Processo() {
        this.estadoAtual = new ProcessoProtocolado();
        System.out.println("Processo protocolado com sucesso!");
    }

    public void setEstadoAtual(EstadosProcesso estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void protocolar() {
        estadoAtual.protocolar(this);
    }

    public void deferir() {
        estadoAtual.deferir(this);
    }

    public void indeferir() {
        estadoAtual.indeferir(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }

    public void arquivar() {
        estadoAtual.arquivar(this);
    }
}
