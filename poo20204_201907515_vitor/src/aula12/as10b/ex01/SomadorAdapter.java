package aula12.as10b.ex01;

import java.util.ArrayList;
import java.util.List;

/*
 Exercício 1
*/

public class SomadorAdapter implements SomadorEsperado {

    private SomadorExistente somador = new SomadorExistente();

    @Override
    public int somaVetor(int[] vetor) {
        int tamanho = vetor.length;
        List <Integer> lista = new ArrayList<Integer>();

        for (int i = 0 ; i < tamanho ; i++) {
             lista.add(vetor[i]);
        }
        return somador.somaLista(lista);
    }
}
