package Lab7.Problema3;

import java.util.*;

public class SListSet<E> implements SortedSet<E> {
    private final LinkedList<E> list = new LinkedList<>();
    private Comparator<? super E> comparator;

    public SListSet() {
        this.comparator = null; // sortare naturală
    }

    public SListSet(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    @Override
    public Comparator<? super E> comparator() {
        return comparator;
    }

    @Override
    public boolean add(E o) {
        if (list.contains(o))
            return false;
        list.add(o);
        sortList();
        return true;
    }

    private void sortList() {
        list.sort(comparator);
    }

    @Override
    public E first() {
        if (list.isEmpty())
            throw new NoSuchElementException();
        return list.getFirst();
    }

    @Override
    public E last() {
        if (list.isEmpty())
            throw new NoSuchElementException();
        return list.getLast();
    }

    @Override
    public SortedSet<E> subSet(E fromElement, E toElement) {
        SListSet<E> subset = new SListSet<>(comparator);
        for (E e : list) {
            if (compare(e, fromElement) >= 0 && compare(e, toElement) < 0) {
                subset.add(e);
            }
        }
        return subset;
    }

    @Override
    public SortedSet<E> headSet(E toElement) {
        SListSet<E> head = new SListSet<>(comparator);
        for (E e : list) {
            if (compare(e, toElement) < 0)
                head.add(e);
        }
        return head;
    }

    @Override
    public SortedSet<E> tailSet(E fromElement) {
        SListSet<E> tail = new SListSet<>(comparator);
        for (E e : list) {
            if (compare(e, fromElement) >= 0)
                tail.add(e);
        }
        return tail;
    }

    private int compare(E a, E b) {
        if (comparator != null) return comparator.compare(a, b);
        return ((Comparable<? super E>) a).compareTo(b);
    }

    // Metode din Set care trebuie implementate
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c) {
            if (add(e)) modified = true;
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public void clear() {
        list.clear();
    }
}
