package State.etats;

import State.Guichet;
import State.IEtat;

public class GuichetAvecCarte implements IEtat {

    private Guichet guichet;

    public GuichetAvecCarte(Guichet guichet) {
        this.guichet = guichet;
    }

    public void insererCarte() {
        System.out.println("Une carte est déjà insérée.");
    }

    public void ejecterCarte() {
        System.out.println("Carte éjectée.");
        this.guichet.setEtatCourant(guichet.getEtatSansCarte());
    }

    public void saisirPin(int pin) {
        System.out.println("Code PIN saisi.");
        this.guichet.setEtatCourant(guichet.getEtatAttentePin());
    }

    public void retrait(int montant) {
        System.out.println("Code PIN non saisi.");
    }
}
