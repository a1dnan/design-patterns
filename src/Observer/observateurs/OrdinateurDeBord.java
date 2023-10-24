package Observer.observateurs;

import Observer.IObserver;

public class OrdinateurDeBord implements IObserver {

    @Override
    public void update(String nom, int valeur) {
        System.out.println("Ordinateur De Bord notifié par : " + nom + " valeur : " + valeur);
    }
}
