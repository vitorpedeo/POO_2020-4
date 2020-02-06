package aula12.as10b.ex03;

import java.util.ArrayList;
import java.util.List;

/*
 Exercício 3
*/

public class Sensor implements Subject {

    private List<Observer> observadores;

    public Sensor() {
        this.observadores = new ArrayList<>();
    }

    public void sofrerInvasao() {
        this.notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observadores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observadores.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer ob : observadores) {
            ob.update("ALERTA!!INVASÃO DETECTADA");
        }
    }
}
