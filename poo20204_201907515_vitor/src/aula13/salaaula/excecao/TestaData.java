package aula13.salaaula.excecao;

public class TestaData {
    public static void main(String[] args) {
        FormataData formatter = new FormataData();

        try {
            System.out.println(formatter.formatar("0cu"));
        } catch (Exception e) {
            System.out.println("ERRO");
            System.out.println("Formato informado não se refere a uma Data!");
        } finally {
            System.out.println("Execução Obrigatória!");
        }
    }

}
