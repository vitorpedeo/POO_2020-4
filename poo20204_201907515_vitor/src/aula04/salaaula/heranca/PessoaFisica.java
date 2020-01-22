package aula04.salaaula.heranca;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String sexo;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String sexo, String estadoCivil) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String toString() {
        //Testar esse super, acho que tá errado (certo seria sb.append(super.toString()))
        return super.toString() + String.format("CPF: %s\nSexo: %s\nEstado Civil: %s\n", this.getCpf(), this.getSexo(),
                this.getEstadoCivil());
    }
}