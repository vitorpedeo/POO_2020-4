package aula04.salaaula.heranca;

import java.util.List;

public class Cliente extends PessoaFisica {
    private double renda;
    private String profissao;
    private List<String> interesses;

    public Cliente(String nome, String endereco, String telefone, String cpf, String sexo, String estadoCivil,
            double renda, String profissao, List<String> interesses) {

        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.renda = renda;
        this.profissao = profissao;
        this.interesses = interesses;
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
        return super.toString() + String.format("Renda: %f\nProfissão: %s", this.getRenda(), this.getProfissao());
    }
}