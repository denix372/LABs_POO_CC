package Lab8.Problema3;

import java.util.*;

public class LinkedList<T> implements Iterable<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this(data, null);
        }

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> head = null;
    private Node<T> tail = null;

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data, head);
        head = newNode;
        if (tail == null)
            tail = head;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(tail!= null) {
            tail.next = newNode;
            tail = newNode;
        } else {
            head = tail = newNode;
        }
    }

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
            if(!hasNext())
                throw new NoSuchElementException();
            T value = current.data;
            current = current.next;
            return value;
        }
    }

}
