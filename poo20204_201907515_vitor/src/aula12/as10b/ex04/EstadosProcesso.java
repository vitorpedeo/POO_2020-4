package aula12.as10b.ex04;

public interface EstadosProcesso {
    public void protocolar(Processo processo);
    public void deferir(Processo processo);
    public void indeferir(Processo processo);
    public void cancelar(Processo processo);
    public void arquivar(Processo processo);
}
