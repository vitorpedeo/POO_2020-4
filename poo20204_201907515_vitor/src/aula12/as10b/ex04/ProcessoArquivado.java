package aula12.as10b.ex04;

public class ProcessoArquivado implements EstadosProcesso {
    @Override
    public void protocolar(Processo processo) {
        System.out.println("Processo arquivado, portanto já foi protocolado!");
    }

    @Override
    public void deferir(Processo processo) {
        System.out.println("Processo arquivado, impossível deferi-lo!");
    }

    @Override
    public void indeferir(Processo processo) {
        System.out.println("Processo arquivado, impossível indeferi-lo!");
    }

    @Override
    public void cancelar(Processo processo) {
        System.out.println("Processo arquivado, impossível cancela-lo!");
    }

    @Override
    public void arquivar(Processo processo) {
        System.out.println("Processo já cancelado!");
    }
}
