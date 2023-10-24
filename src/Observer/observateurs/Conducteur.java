package Observer.observateurs;

import Observer.IObserver;

public class Conducteur implements IObserver {


    @Override
    public void update(String nom, int valeur) {
        System.out.println("Conducteur notifié par : " + nom + " valeur : " + valeur);
    }
}
