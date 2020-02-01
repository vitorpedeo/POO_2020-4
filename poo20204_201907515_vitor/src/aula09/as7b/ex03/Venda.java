package aula09.as7b.ex03;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
  Exercício 3
*/

public class Venda {

    private Cliente comprador;
    private Obra obraVendida;
    private Date dataVenda;

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Obra getObraVendida() {
        return obraVendida;
    }

    public void setObraVendida(Obra obraVendida) {
        this.obraVendida = obraVendida;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void imprimirDados() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\n*****************************");
        System.out.println("-----Dados da Venda-----");
        System.out.println("Nome do Comprador: " + this.getComprador().getNome());
        System.out.println("CPF do Comprador: " + this.getComprador().getCpf());
        System.out.println("Telefone do Comprador: " + this.getComprador().getTelefone());
        System.out.println("Nome da Obra Vendida: " + this.getObraVendida().getTitulo());
        System.out.println("Data da Venda: " + sdf.format(this.getDataVenda()));
        System.out.println("*****************************\n");
    }
}
