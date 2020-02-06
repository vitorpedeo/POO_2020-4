package aula12.as10b.ex01;

import java.util.List;

/*
 Exercício 1
*/

public class SomadorExistente {

    public int somaLista(List<Integer> lista) {
        int resultado = 0;
        for (Integer i : lista) {
            resultado += i;
        }
        return resultado;
    }
}
