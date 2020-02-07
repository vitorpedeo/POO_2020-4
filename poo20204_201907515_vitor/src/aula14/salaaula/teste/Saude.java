package aula14.salaaula.teste;

public class Saude {

    int idade;
    double altura;
    double peso;

    public Saude(int idade, double altura, double peso) {
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public double calculaIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }

    public String condicaoFisica() {
        double imc = calculaIMC();
        String result;

        if (imc < 18.5) {
            result = "Abaixo do Peso";
        } else if (imc <= 24.9) {
            result = "Peso Normal";
        } else if (imc <= 29.9) {
            result = "Sobrepeso";
        } else {
            result = "Obesidade";
        }
        return result;
    }
}
