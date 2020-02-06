package aula12.as10b.ex04;

public class ProcessoProtocolado implements EstadosProcesso {
    @Override
    public void protocolar(Processo processo) {
        System.out.println("Processo já está protocolado!");
    }

    @Override
    public void deferir(Processo processo) {
        processo.setEstadoAtual(new ProcessoDeferido());
        System.out.println("Processo deferido!");
    }

    @Override
    public void indeferir(Processo processo) {
        processo.setEstadoAtual(new ProcessoIndeferido());
        System.out.println("Processo indeferido!");
    }

    @Override
    public void cancelar(Processo processo) {
        processo.setEstadoAtual(new ProcessoCancelado());
        System.out.println("Processo cancelado!");
    }

    @Override
    public void arquivar(Processo processo) {
        System.out.println("Processo protocolado mas sua situação ainda não foi definida!");
        System.out.println("Processo necessita de ser deferido, indeferido ou cancelado antes de ser arquivado!");
    }
}
