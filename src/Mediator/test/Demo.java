package Mediator.test;

import Mediator.model.Administrateur;
import Mediator.model.Amis1;
import Mediator.model.Amis2;
import Mediator.service.Group;

public class Demo {
    public static void main(String[] args) {
        System.out.println("***Mediator Pattern Demo***\n");
        Group m = new Group();
        Amis1 youness = new Amis1(m, "Youness");
        Amis2 taha = new Amis2(m, "Taha");
        Administrateur admin = new Administrateur(m, "Admin");
        m.setAmis1(youness);
        m.setAmis2(taha);
        m.setAdmin(admin);
        youness.envoyer("[Youness]: Bonjour Taha");
        taha.envoyer("[Taha]: Bonjour Youness.");
        admin.envoyer("\n[Admin]: Bonjour vous deux, allez travailler");
    }
}
