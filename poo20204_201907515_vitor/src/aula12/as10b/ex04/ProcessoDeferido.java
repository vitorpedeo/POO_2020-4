package aula12.as10b.ex04;

public class ProcessoDeferido implements EstadosProcesso {
    @Override
    public void protocolar(Processo processo) {
        System.out.println("Processo deferido, portanto já está protocolado!");
    }

    @Override
    public void deferir(Processo processo) {
        System.out.println("Processo já foi deferido!");
    }

    @Override
    public void indeferir(Processo processo) {
        System.out.println("Processo deferido, impossível indeferi-lo!");
    }

    @Override
    public void cancelar(Processo processo) {
        System.out.println("Processo deferido cancelado!");
        processo.setEstadoAtual(new ProcessoCancelado());
    }

    @Override
    public void arquivar(Processo processo) {
        System.out.println("Processo deferido arquivado!");
        processo.setEstadoAtual(new ProcessoArquivado());
    }
}
