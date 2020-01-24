package aula06.salaaula.endereco;

import java.util.ArrayList;
import java.util.List;

public class Bairro {

    private String nome;
    private String regiao;
    private Municipio municipio;
    private List<Endereco> enderecos;

    public Bairro(String nome, String regiao, Municipio municipio) {
        this.nome = nome;
        this.regiao = regiao;
        this.municipio = municipio;
        this.enderecos = new ArrayList<Endereco>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void adicionaEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public Endereco consultaEndereco(Endereco endereco) {
        Endereco novoEndereco = null;

        if (this.enderecos.contains(endereco)) {
            novoEndereco = endereco;
        }

        return novoEndereco;
    }

    public void removeEndereco(Endereco endereco) {
        this.enderecos.remove(endereco);
    }

}