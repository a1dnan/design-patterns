package Observer.capteurs;

import Observer.ISubject;
import Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Humidite implements ISubject {

    List<IObserver> observers = new ArrayList<>();
    private int tauxHumidite;

    public int getTauxHumidite() {
        return tauxHumidite;
    }

    public void setTauxHumidite(int tauxHumidite) {
        this.tauxHumidite = tauxHumidite;
        notifier(tauxHumidite);
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
