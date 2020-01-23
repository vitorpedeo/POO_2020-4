package aula04.salaaula.heranca1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente extends PessoaFisica {

    protected double renda;
    protected String profissao;
    protected List<String> interesses;

    public Cliente(String nome, String endereco, String telefone, String cpf, String sexo, String estadoCivil,
            double renda, String profissao) {

        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.renda = renda;
        this.profissao = profissao;
        interesses = new ArrayList<String>();
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<String> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<String> interesses) {
        this.interesses = interesses;
    }

    public String toString() {
        return super.toString() + String.format("Renda: %.2f\nProfissão: %s", this.getRenda(), this.getProfissao());
    }

    public void adicionaInteresse(String interesse) {
        this.getInteresses().add(interesse);
    }

    public String consultaInteresse(String interesse) {
        String novoInteresse = null;

        for (String s : this.getInteresses()) {
            if (s.equalsIgnoreCase(interesse)) {
                novoInteresse = s;
            }
        }
        return novoInteresse;
    }

    public void removeInteresse(String interesse) {
        Iterator<String> iterator = interesses.iterator();
        int quantidadeInteresses = interesses.size();

        while (iterator.hasNext()) {
            String interesseRemover = iterator.next();

            if (interesseRemover.equals(interesse)) {
                iterator.remove();
            }
        }

        int novaQuantidadeInteresses = interesses.size();

        if (novaQuantidadeInteresses < quantidadeInteresses) {
            System.out.println("O interesse de nome " + interesse + " foi removido!");
        } else {
            System.out.println("O interesse não foi encontrado!");
        }
    }
}