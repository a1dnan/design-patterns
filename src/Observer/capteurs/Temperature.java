package Observer.capteurs;

import Observer.IObserver;
import Observer.ISubject;

import java.util.ArrayList;
import java.util.List;

public class Temperature implements ISubject {
    List<IObserver> observers = new ArrayList<>();
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifier(temperature);
    }

    @Override
    public void ajouter(IObserver o) {
        observers.add(o);
    }

    @Override
    public void supprimer(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifier(int valeur) {
        for (IObserver observer : observers) {
            observer.update(this.getClass().getSimpleName(), valeur);
        }
    }
}
