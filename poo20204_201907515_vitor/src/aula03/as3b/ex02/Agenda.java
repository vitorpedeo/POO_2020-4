package aula03.as3b.ex02;

import java.util.ArrayList;
import java.util.List;

/*
  Exercício 2
*/

public class Agenda {
    private List<Pessoa> contatos = new ArrayList<Pessoa>();

    public List<Pessoa> getContatos() {
        return contatos;
    }

    public void setContatos(List<Pessoa> contatos) {
        this.contatos = contatos;
    }

    public void armazenaPessoa(String nome, int idade, double altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        contatos.add(pessoa);
    }

    public void removePessoa(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (nome.equalsIgnoreCase(contatos.get(i).getNome())) {
                contatos.remove(i);
            }
        }
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (nome.equalsIgnoreCase(contatos.get(i).getNome())) {
                return i;
            }
        }
        return -1;
    }

    public void imprimeAgenda() {
        System.out.println("\nContatos:");
        for (Pessoa p : this.getContatos()) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade() + " anos");
            System.out.println("Altura: " + p.getAltura() + "cm\n");
        }
    }

    public void imprimePessoa(int index) {
        System.out.println("\nContato " + index + ":");
        System.out.println("Nome: " + contatos.get(index).getNome());
        System.out.println("Idade: " + contatos.get(index).getIdade() + " anos");
        System.out.println("Altura: " + contatos.get(index).getAltura() + "cm\n");
    }

}