package Memento;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Calculatrice calculatrice = new Calculatrice();
        calculatrice.setA(2);
        calculatrice.setB(4);
        CareTaker careTaker = new CareTaker();
        Memento memento = calculatrice.CreerMemento();
        careTaker.add(memento);
        System.out.println(calculatrice.getA()+ "  "+calculatrice.getB());

        calculatrice.setA(8);
        calculatrice.setB(8);
        careTaker.add(memento);
        System.out.println(calculatrice.getA()+ "  "+calculatrice.getB());

        calculatrice.ctlZ(memento);
        System.out.println(calculatrice.getA()+ "  "+calculatrice.getB());


    }
}
