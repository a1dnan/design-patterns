package Flyweight;


import Flyweight.model.IVehicule;
import Flyweight.service.Usine;

public class demo {
    public static void main(String[] args) throws Exception {
        System.out.println("***Flyweight Pattern Demo***");
        Usine usine = new Usine();
        IVehicule vehicule;
        System.out.println("-------- Voiture -------");

        vehicule = usine.getVehicule("voiture", "Audi", "Rouge");
        System.out.println(vehicule);

        vehicule = usine.getVehicule("voiture", "BMW", "Noire");
        System.out.println(vehicule);

        System.out.println("------- Moto -------");

        vehicule = usine.getVehicule("moto", "Yamaha", "Noire");
        System.out.println(vehicule);

        vehicule = usine.getVehicule("moto", "Kawazaki", "Rouge");
        System.out.println(vehicule);

        System.out.println("Nombre des vehicules créés : " + usine.nombreVehicule());



    }
}
