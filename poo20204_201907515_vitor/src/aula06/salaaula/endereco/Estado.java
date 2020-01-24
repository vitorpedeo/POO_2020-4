package aula06.salaaula.endereco;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    
    private String nome;
    private String sigla;
    private Pais pais;
    private List <Municipio> municipios;

    public Estado (String nome, String sigla, Pais pais) {
          this.nome = nome;
          this.sigla = sigla;
          this.pais = pais;
          this.municipios = new ArrayList <Municipio>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }

    public void setMunicipios(List<Municipio> municipios) {
        this.municipios = municipios;
    }

    public void adicionaMunicipio(Municipio municipio) {
        this.municipios.add(municipio);
    }

    public Municipio consultaMunicipo(String nome) {
        Municipio novoMunicipio = null;
        for (Municipio m : this.municipios) {
            if (m.getNome().equals(nome)) {
                   novoMunicipio = m;
            }
        }
        return novoMunicipio;
    }

    public void removeMuncipio(Municipio municipio) {
        this.municipios.remove(municipio);
    }
}