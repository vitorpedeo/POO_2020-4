package aula09.as7b.ex01.contexto12;

/*
  Exercício 1
*/

public class Veiculo implements Modelo {
     
    private int placa;
    private Empregado responsavel;

    public Veiculo(int placa, Empregado responsavel) {
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
        return String.format("\nNome do Projeto: %s\nPlaca do Veículo: %d\n", TITULO_DO_PROJETO, this.getPlaca());
    }

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Dados do Veículo: ");
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Nome do Responsável: " + this.getResponsavel().getNome());
        System.out.println("Código do Responsável: " + this.getResponsavel().getCodigo());
        System.out.println("Idade do Responsável: " + this.getResponsavel().getIdade());
        System.out.println("------------------------");
    }
    

}