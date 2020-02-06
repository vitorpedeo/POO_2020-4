package aula11.as9b.ex02;

/*
 Exercício 2
*/

public class VisualizadorJPG implements Visualizador {
    @Override
    public void visualizar() {
        ImagemJPG img = new ImagemJPG();
        img.carregar();
        img.exibir();
        img.fechar();
    }
}
