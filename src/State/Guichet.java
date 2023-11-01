package State;

import State.etats.GuichetAvecCarte;
import State.etats.GuichetEnAttenteDeCodePin;
import State.etats.GuichetSansArgent;
import State.etats.GuichetSansCarte;

public class Guichet {

    private IEtat etatCourant;
    private IEtat etatAvecCarte;
    private IEtat etatSansCarte;
    private IEtat etatAttentePin;
    private IEtat etatSansArgent;

    public Guichet() {
        this.etatAvecCarte = new GuichetAvecCarte(this);
        this.etatSansCarte = new GuichetSansCarte(this);
        this.etatAttentePin = new GuichetEnAttenteDeCodePin(this);
        this.etatSansArgent = new GuichetSansArgent(this);
        this.etatCourant = etatSansCarte;
    }

    public void insererCarte() {
        etatCourant.insererCarte();
    }

    public void ejecterCarte() {
        etatCourant.ejecterCarte();
    }

    public void saisirPin(int pin) {
        etatCourant.saisirPin(pin);
    }

    public void retrait(int montant) {
        etatCourant.retrait(montant);
    }


    public void setEtatCourant(IEtat etatCourant) {
        this.etatCourant = etatCourant;
    }

    public IEtat getEtatCourant() {
        return etatCourant;
    }

    public IEtat getEtatAvecCarte() {
        return etatAvecCarte;
    }

    public IEtat getEtatSansCarte() {
        return etatSansCarte;
    }

    public IEtat getEtatAttentePin() {
        return etatAttentePin;
    }

    public IEtat getEtatSansArgent() {
        return etatSansArgent;
    }
}
