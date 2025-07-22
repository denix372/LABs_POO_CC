package Lab3.Problema3;

public class MyQueue {
    private static final int INFINIT = 9500;
    private MyArray array;
    private int front;
    private int back;
    private int size;

    public MyQueue() {
        array = new MyArray(100);
        front = 0;
        back = 0;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int value) {
        array.set(back, value);
        back++;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) return INFINIT;
        int val = array.get(front);
        front++;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String rezultat = "Coada: ";
        for (int i = front; i < back; i++) {
            rezultat += array.get(i) + " ";
        }
        return rezultat.trim();
    }

}
