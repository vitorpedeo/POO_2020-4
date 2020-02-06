package aula12.as10b.ex03;

/*
 Exercício 3
*/

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAllObservers();
}
