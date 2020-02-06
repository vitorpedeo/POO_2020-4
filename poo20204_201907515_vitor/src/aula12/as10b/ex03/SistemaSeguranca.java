package aula12.as10b.ex03;

import java.util.ArrayList;
import java.util.List;

/*
 Exercício 3
*/

public class SistemaSeguranca implements Observer, Subject {

    private Subject sensor;
    private List<Observer> seguros;
    private List<Observer> policiais;

    public SistemaSeguranca(Subject sensor) {
        this.sensor = sensor;
        this.seguros = new ArrayList<>();
        this.policiais = new ArrayList<>();
        sensor.registerObserver(this);
    }

    @Override
    public void update(String texto) {
        System.out.println("\nAlerta recebido");
        System.out.println(texto);
        System.out.println("Informando Companhia de Seguro e Polícia");
        this.notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer instanceof CompanhiaSeguro) {
            this.seguros.add(observer);
        } else {
            this.policiais.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer instanceof CompanhiaSeguro) {
            this.seguros.remove(observer);
        } else {
            this.policiais.remove(observer);
        }
    }

    @Override
    public void notifyAllObservers() {
        for (Observer ob : seguros) {
              ob.update("ALERTA DE INVASÃO");
        }
        for (Observer ob : policiais) {
              ob.update("ALERTA DE INVASÃO");
        }
    }
}
