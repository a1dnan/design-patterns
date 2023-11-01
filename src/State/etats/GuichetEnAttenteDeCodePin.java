package State.etats;

import State.Guichet;
import State.IEtat;

public class GuichetEnAttenteDeCodePin implements IEtat {
    private Guichet guichet;

    public GuichetEnAttenteDeCodePin(Guichet guichet) {
        this.guichet = guichet;
    }

    public void insererCarte() {
        System.out.println("Une carte est déjà insérée.");
    }

    public void ejecterCarte() {
        System.out.println("Carte éjectée.");
        guichet.setEtatCourant(guichet.getEtatSansCarte());
    }

    public void saisirPin(int pin) {
        System.out.println("Code PIN déjà saisi.");
    }

    public void retrait(int montant) {
        System.out.println("Effectuer un retrait de " + montant + " MAD.");
    }
}
