package Mediator.service;

import Mediator.model.Amis;

public abstract class Mediator {
    public abstract void envoyer(Amis amis, String message);
}
