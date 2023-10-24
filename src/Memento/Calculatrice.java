package Memento;

public class Calculatrice {

    private int a;
    private int b;

    public void ctlZ(Memento memento){
        this.a = memento.getA();
        this.b = memento.getB();
    }
    public Memento CreerMemento() {
        return new Memento(a, b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
