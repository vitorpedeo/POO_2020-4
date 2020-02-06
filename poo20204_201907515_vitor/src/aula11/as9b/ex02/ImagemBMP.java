package aula11.as9b.ex02;

/*
 Exercício 2
*/

public class ImagemBMP implements Imagem {
    @Override
    public void carregar() {
        System.out.println("Carregando Imagem BMP...");
        System.out.print("...");
        System.out.print("...");
        System.out.print("");
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo Imagem por 20 segundos.");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando Imagem.\n");
    }
}
