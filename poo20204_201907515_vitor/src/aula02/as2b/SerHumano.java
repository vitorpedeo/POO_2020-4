package aula02.as2b;

/*
  Exercício 3
*/

public class SerHumano {
    String sexo;
    String corOlho;
    String corCabelo;
    int idade;

    public void setSexo(String n) {
        this.sexo = n;
    }

    public void setCorOlho(String co) {
        this.corOlho = co;
    }

    public void setCorCabelo(String cc) {
        this.corCabelo = cc;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getCorOlho() {
        return this.corOlho;
    }

    public String getCorCabelo() {
        return this.corCabelo;
    }

    public int getIdade() {
        return this.idade;
    }
}
