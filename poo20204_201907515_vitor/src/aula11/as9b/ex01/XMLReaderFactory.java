package aula11.as9b.ex01;

/*
 Exercício 1
*/

public class XMLReaderFactory extends Factory {
    public XMLReader createXMLReader(String tipo) {
        if ( tipo.equalsIgnoreCase("UM")) {
             return new TipoUm();
        } else if (tipo.equalsIgnoreCase("DOIS")) {
            return new TipoDois();
        } else {
            throw new IllegalArgumentException("Tipo Não Suportado");
        }
    }

    @Override
    public XMLReader createXMLReader() {
        return null;
    }

}
