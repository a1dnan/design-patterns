package Composite;

import Composite.model.Developer;
import Composite.model.Employe;
import Composite.model.Manager;

public class CompositeDesignPatternMain {

    public static void main(String[] args) {
        Employe emp1=new Developer("Adnan", 10000);
        Employe emp2=new Developer("Mohammed", 15000);
        Employe manager1=new Manager("Ali",25000);
        manager1.add(emp1);
        manager1.add(emp2);
        Employe emp3=new Developer("John", 20000);
        Manager generalManager=new Manager("Jack", 50000);
        generalManager.add(emp3);
        generalManager.add(manager1);
        generalManager.print();
    }
}
