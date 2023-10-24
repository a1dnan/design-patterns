package Composite.model;

public class Developer implements Employe{

    private String nom;
    private double salaire;

    public Developer(String nom,double
            salaire){
        this.nom = nom;
        this.salaire = salaire;
    }
    @Override
    public void add(Employe employe) {

    }

    @Override
    public void remove(Employe employee) {

    }

    @Override
    public Employe getChild(int i) {
        return null;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public double getSalaire() {
        return salaire;
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.println("Nom = "+getNom());
        System.out.println("Salaire = "+getSalaire());
        System.out.println("-------------");
    }

}
