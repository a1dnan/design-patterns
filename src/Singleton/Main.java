package Singleton;

public class Main {
    public static void main(String[] args) {

        CompteBancaire compteBancaire = new CompteBancaire(123, 5000);
        CompteBancaire compteBancaire2 = new CompteBancaire(321, 5000);
        compteBancaire.deposerArgent(100);
        compteBancaire.retirerArgent(80);
        compteBancaire2.deposerArgent(200);
        compteBancaire2.retirerArgent(110);
        Journalisation.getInstance().getLog();

    }
}
