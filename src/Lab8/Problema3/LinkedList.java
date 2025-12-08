package Lab8.Problema3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }

    private Node<T> head;
    private Node<T> tail;

    //Insereaza un nod la inceputul listei
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data, head);
        head = newNode;
        if (tail == null)
            tail = newNode;
    }

    //Insereaza un nod la sfarsitul listei
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    //Returneaza un obiect de tip ListIterator
    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if(current == null)
                throw new NoSuchElementException();
            T data = current.data;
            current = current.next;
            return data;
        }
    }
}
