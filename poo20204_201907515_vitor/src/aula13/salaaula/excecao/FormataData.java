package aula13.salaaula.excecao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormataData {

    static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public Date formatar(String newDate) throws ParseException {
        Date dataFormatada = formato.parse(newDate);
        return dataFormatada;
    }

}
