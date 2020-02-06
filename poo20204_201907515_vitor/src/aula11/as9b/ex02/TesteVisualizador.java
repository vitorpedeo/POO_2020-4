package aula11.as9b.ex02;

/*
 Exercício 2
*/

public class TesteVisualizador {
    public static void main(String[] args) {
        VisualizadorFactory factory = new VisualizadorFactory();
        //Visualizador de Imagens BMP
        Visualizador visualizadorUm = factory.criaVisualizador("BMP");
        visualizadorUm.visualizar();

        //Visualizador de Imagens JPG
        Visualizador visualizadorDois = factory.criaVisualizador("JPG");
        visualizadorDois.visualizar();
    }
}
