package Observer.capteurs;

import Observer.IObserver;
import Observer.ISubject;

import java.util.ArrayList;
import java.util.List;

public class LumiereAmbiante implements ISubject {

    List<IObserver> observers = new ArrayList<>();
    private int tauxLumiere;

    public int getTauxLumiere() {
        return tauxLumiere;
    }

    public void setTauxLumiere(int tauxLumiere) {
        this.tauxLumiere = tauxLumiere;
        notifier(tauxLumiere);
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
