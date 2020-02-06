package aula11.as9b.ex02;

/*
 Exercício 2
*/

public class VisualizadorBMP implements Visualizador {
    public void visualizar() {
        ImagemBMP img = new ImagemBMP();
        img.carregar();
        img.exibir();
        img.fechar();
    }
}
