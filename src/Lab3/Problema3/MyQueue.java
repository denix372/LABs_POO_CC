package Lab3.Problema3;

public class MyQueue {
    MyArray arr;
    final int Infinit;
    int first, last, size;

    public MyQueue() {
        arr = new MyArray();
        Infinit = 9500;
        first = 0;
        last = 0;
        size = 0;
    }

    int getSize() {
        return size;
    }

    void enqueue(int value) {
        arr.set(last, value);
        size++;
        last++;
    }

    int dequeue() {
        if (size == 0)
            return Infinit;
        size--;
        first++;
        return arr.get(first - 1);
    }
    
    boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString() {
        StringBuffer st = new StringBuffer();
        for(int i = first; i < last; i++)
            st.append(arr.get(i)).append(" ");
        return st.toString();
    }
}
