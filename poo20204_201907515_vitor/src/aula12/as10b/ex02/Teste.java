package aula12.as10b.ex02;

/*
 Exercício 2
*/

public class Teste {
    public static void main(String[] args) {
        Pasta raiz = new Pasta("Raíz");
        Pasta user = new Pasta("User");
        Arquivo jogo1 = new Arquivo("Grand Theft Auto San Andreas.exe",150000000);
        Arquivo jogo2 = new Arquivo("Mortal Kombat 3.exe", 120000);
        Pasta temp = new Pasta("Temp");
        Arquivo dll1 = new Arquivo("birl.dll",120);
        Arquivo dll2 = new Arquivo("yesh.dll",150);
        raiz.adicionarSubpasta(user);
        user.adicionarArquivo(jogo1);
        user.adicionarArquivo(jogo2);
        user.adicionarSubpasta(temp);
        temp.adicionarArquivo(dll1);
        temp.adicionarArquivo(dll2);

        System.out.println("\n----MOSTRANDO DIRETÓRIO----\n");
        raiz.mostrar();


    }
}
