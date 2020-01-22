package aula04.salaaula.heranca;

import java.util.List;

public class Fornecedor extends PessoaJuridica {

    private List<String> produtos;

    public Fornecedor(String nome, String endereco, String telefone, String cnpj, String razaoSocial,
            List<String> produtos) {

        super(nome, endereco, telefone, cnpj, razaoSocial);
        this.produtos = produtos;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

}