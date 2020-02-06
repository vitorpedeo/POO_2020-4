package aula13.salaaula.arquivos;

import java.io.*;

public class TestaSaida {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("saida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bf = new BufferedWriter(osw);

        bf.write("Testando a geração e escrita de arquivos utilizando Java IO");
        bf.close();
    }
}
