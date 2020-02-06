package aula12.as10b.ex03;

/*
 Exercício 3
*/

public class Teste {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        SistemaSeguranca ss = new SistemaSeguranca(sensor);
        CompanhiaSeguro cs = new CompanhiaSeguro(ss);
        Policia p = new Policia(ss);
        sensor.sofrerInvasao();
    }
}
