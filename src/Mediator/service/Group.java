package Mediator.service;

import Mediator.model.Administrateur;
import Mediator.model.Amis;
import Mediator.model.Amis1;
import Mediator.model.Amis2;

public class Group extends Mediator {

    private Amis1 amis1;
    private Amis2 amis2;
    private Administrateur admin;

    public void setAmis1(Amis1 amis1) {
        this.amis1 = amis1;
    }

    public void setAmis2(Amis2 amis2) {
        this.amis2 = amis2;
    }

    public void setAdmin(Administrateur admin) {
        this.admin = admin;
    }

    @Override
    public void envoyer(Amis amis, String message) {
        if (amis == amis1) {
            amis2.notifier(message);
            admin.notifier(amis1.getNom() + " message � " + amis2.getNom());
        }
        if (amis == amis2) {
            amis1.notifier(message);
            admin.notifier(amis2.getNom() + " message � " + amis2.getNom());
        }
        if (amis == admin) {
            amis1.notifier(message);
            amis2.notifier(message);
        }
    }
}
