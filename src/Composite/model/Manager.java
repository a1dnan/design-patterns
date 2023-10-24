package Composite.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employe{
    private String nom;
    private double salaire;
    List<Employe> employes = new ArrayList<Employe>();

    public Manager(String nom,double salaire){
        this.nom = nom;
        this.salaire = salaire;
    }
    @Override
    public void add(Employe employe) {
        employes.add(employe);
    }

    @Override
    public void remove(Employe employee) {
        employee.remove(employee);
    }

    @Override
    public Employe getChild(int i) {
        return employes.get(i);
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
        System.out.println("nom = "+getNom());
        System.out.println("salaire = "+getSalaire());
        System.out.println("-------------");
        Iterator<Employe> employeIterator =
                employes.iterator();
        while(employeIterator.hasNext()){
            Employe employe = employeIterator.next();
            employe.print();
        }
    }
}
