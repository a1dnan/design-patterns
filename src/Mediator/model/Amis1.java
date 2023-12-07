package Mediator.model;

import Mediator.service.Mediator;

public class Amis1 extends Amis {
    public Amis1(Mediator mediator, String nom) {
        super(mediator);
        this.nom = nom;
    }

    public void envoyer(String msg) {
        mediator.envoyer(this, msg);
    }

    public void notifier(String msg) {
        System.out.println(nom + " a recu le message : " + msg);
    }
}
