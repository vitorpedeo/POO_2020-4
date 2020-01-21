package aula03.salaaula;

public class TestaQuadrado {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        Quadrado q3 = new Quadrado();

        //A cor de todos os objetos da classe Quadrado será verde. 
        Quadrado.cor = "Verde"; //Ou também q1.cor = "Verde" ou q2.cor = "Verde"
        //Agora a cor de todos os objetos será vermelho.
        Quadrado.cor = "Vemelho";
        //Agora será amarelo
        Quadrado.cor = "Amarelo";
      
        System.out.println("\nCor do Quadrado q1: " + q1.cor);
        System.out.println("Cor do Quadrado q2: " + q2.cor);
        System.out.println("Cor do Quadrado q3: " + q3.cor);
        System.out.println("Cor da classe Quadrado: " + Quadrado.cor + "\n");

    }
}