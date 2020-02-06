package aula12.as10b.ex04;

public class ProcessoIndeferido implements  EstadosProcesso {
    @Override
    public void protocolar(Processo processo) {
        System.out.println("Processo indeferido, portanto já está protocolado!");
    }

    @Override
    public void deferir(Processo processo) {
        System.out.println("Processo indeferido, impossível deferi-lo!");
    }

    @Override
    public void indeferir(Processo processo) {
        System.out.println("Processo já foi indeferido!");
    }

    @Override
    public void cancelar(Processo processo) {
        System.out.println("Processo indeferido cancelado!");
        processo.setEstadoAtual(new ProcessoCancelado());
    }

    @Override
    public void arquivar(Processo processo) {
        System.out.println("Processo indeferido arquivado!");
        processo.setEstadoAtual(new ProcessoArquivado());
    }
}
