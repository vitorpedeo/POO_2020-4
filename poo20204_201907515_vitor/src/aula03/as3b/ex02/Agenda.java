package aula03.as3b.ex02;

import java.util.ArrayList;
import java.util.Iterator;
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
        Iterator<Pessoa> iterator = contatos.iterator();
        int quantidadePessoas = contatos.size();

        while (iterator.hasNext()) {
            Pessoa pessoaRemover = iterator.next();

            if (pessoaRemover.getNome().equals(nome)) {
                iterator.remove();
            }
        }

        int novaQuantidadePessoas = contatos.size();

        if (novaQuantidadePessoas < quantidadePessoas) {
            System.out.println("O Contato de nome " + nome + " foi removido!");
        } else {
            System.out.println("O Contato não foi encontrado!");
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
        if (index > this.getContatos().size()) {
            System.out.println("O valor informado é maior que o tamanho da Agenda!");
        } else {
            System.out.println("\nContato " + index + ":");
            System.out.println("Nome: " + contatos.get(index).getNome());
            System.out.println("Idade: " + contatos.get(index).getIdade() + " anos");
            System.out.println("Altura: " + contatos.get(index).getAltura() + "cm\n");
        }
    }

}