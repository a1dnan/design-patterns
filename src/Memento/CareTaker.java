package Memento;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> mementoStack;

    public CareTaker() {
        mementoStack = new Stack<Memento>();
    }

    public void add(Memento m) {
        mementoStack.push(m);
    }

    public Memento del() {
        return mementoStack.pop();
    }
}
