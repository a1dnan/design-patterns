package State.etats;

import State.Guichet;
import State.IEtat;

public class GuichetSansCarte implements IEtat {
    private Guichet guichet;

    public GuichetSansCarte(Guichet guichet) {
        this.guichet = guichet;
    }

    public void insererCarte() {
        System.out.println("Carte insérée.");
        guichet.setEtatCourant(guichet.getEtatAvecCarte());
    }

    public void ejecterCarte() {
        System.out.println("Aucune carte insérée.");
    }

    public void saisirPin(int pin) {
        System.out.println("Aucune carte insérée.");
    }

    public void retrait(int montant) {
        System.out.println("Aucune carte insérée.");
    }
}
