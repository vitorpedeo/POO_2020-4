package aula12.salaaula.state;

public interface EstadosPorta {
    public void abrir(Porta p);
    public void fechar(Porta p);
    public void trancar(Porta p);
    public void destrancar(Porta p);
}
