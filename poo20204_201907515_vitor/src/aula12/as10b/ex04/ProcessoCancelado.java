package aula12.as10b.ex04;

public class ProcessoCancelado implements EstadosProcesso {
    @Override
    public void protocolar(Processo processo) {
        System.out.println("Processo cancelado, portanto já foi protocolado!");
    }

    @Override
    public void deferir(Processo processo) {
        System.out.println("Processo cancelado, impossível deferi-lo!");
    }

    @Override
    public void indeferir(Processo processo) {
        System.out.println("Processo cancelado, impossível indeferi-lo!");
    }

    @Override
    public void cancelar(Processo processo) {
        System.out.println("Processo já foi cancelado!");
    }

    @Override
    public void arquivar(Processo processo) {
        System.out.println("Processo cancelado arquivado!");
        processo.setEstadoAtual(new ProcessoArquivado());
    }
}
