package aula11.as9b.ex02;

/*
 Exercício 2
*/

public class VisualizadorFactory implements Factory {
    @Override
    public Visualizador criaVisualizador(String formatoImagem) {
          if ( formatoImagem.equalsIgnoreCase("BMP")) {
               return new VisualizadorBMP();
          }else if ( formatoImagem.equalsIgnoreCase("JPG")) {
               return new VisualizadorJPG();
          } else {
              throw new IllegalArgumentException("Formato não Suportado");
          }
    }
}
