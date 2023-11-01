package State.etats;

import State.Guichet;
import State.IEtat;

public class GuichetSansArgent implements IEtat {

    private Guichet guichet;

    public GuichetSansArgent(Guichet guichet) {
        this.guichet = guichet;
    }

    public void insererCarte() {
        System.out.println("Aucune carte insérée.");
    }

    public void ejecterCarte() {
        System.out.println("Aucune carte insérée.");
    }

    public void saisirPin(int pin) {
        System.out.println("Aucune carte insérée.");
    }

    public void retrait(int montant) {
        System.out.println("Le GAB est vide. Aucun retrait possible.");
    }
}
