package Singleton;

public class CompteBancaire {

    private int numero;
    private double solde;

    CompteBancaire(int numero, double solde){
        this.numero = numero;
        this.solde =solde;
    }

    public void deposerArgent(double montant){
        this.solde+=montant;
        Journalisation.getInstance().ajouterLog(montant + " DH Ajouter comme le solde du compte : "+ this.numero+" => Solde : "+this.solde+" DH");

    }
    public void retirerArgent(double montant){
        this.solde-=montant;
        Journalisation.getInstance().ajouterLog(montant + " DH Retirer comme le solde du compte : "+ this.numero+" => Solde : "+this.solde+" DH");

    }


}
