package Lab4.Problema2;

public class MyStack {
    Array arr;

    public MyStack() {
        arr = new Array();
    }

    public void push(Integer x) {
        arr.addElement(x);
    }

    public int pop() {
        return arr.remove( arr.getSize() - 1);
    }

    @Override
    public String toString() {
        return arr.toString();
    }
}

