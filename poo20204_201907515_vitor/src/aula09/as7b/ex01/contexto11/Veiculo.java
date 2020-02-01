package aula09.as7b.ex01.contexto11;

/*
  Exercício 1
*/

public class Veiculo extends Modelo {

    private int placa;
    private Empregado responsavel;

    public Veiculo(String tituloDoProjeto, int placa, Empregado responsavel) {
        super(tituloDoProjeto);
        this.placa = placa;
        this.responsavel = responsavel;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public Empregado getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Empregado responsavel) {
        this.responsavel = responsavel;
    }

    public String toString() {
        return super.toString() + String.format("Placa do veículo: %d\n", this.getPlaca());
    }

    public void imprimir() {
        System.out.println("-----------------------");
        System.out.println("Dados do Veículo: ");
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Nome do Responsável: " + this.getResponsavel().getNome());
        System.out.println("Código do Responsável: " + this.getResponsavel().getCodigo());
        System.out.println("Idade do Responsável: " + this.getResponsavel().getIdade());
        System.out.println("-----------------------");
    }
    
}