package aula12.salaaula.state;

public class PortaTeste {
    public static void main(String[] args) {
        Porta p = new Porta();
        System.out.println(p.estadoAtual.getClass().getSimpleName());
        p.abrir();
        System.out.println(p.estadoAtual.getClass().getSimpleName());
        p.fechar();
        System.out.println(p.estadoAtual.getClass().getSimpleName());
        p.trancar();
        System.out.println(p.estadoAtual.getClass().getSimpleName());
        p.abrir();
    }
}
