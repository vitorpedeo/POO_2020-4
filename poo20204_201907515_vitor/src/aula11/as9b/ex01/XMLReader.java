package aula11.as9b.ex01;

/*
 Exercício 1
*/

import java.io.InputStream;
import java.net.ContentHandler;

public interface XMLReader {
    public void setContentHandler(ContentHandler handler);
    public void parse(InputStream is);
}
