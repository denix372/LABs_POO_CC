package Lab7.Problema3;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public class SListSet extends LinkedList<Object> implements SortedSet<Object> {
    private Comparator<Object> cmp;
    public SListSet() {
        this(null);
    }

    public SListSet(Comparator cmp) {
        this.cmp = cmp;
    }

    @Override
    public Comparator comparator() { //comparator folosit (null pentru comparatia naturală)
        return cmp;
    }

    public boolean add(Object o) { //adaugă un elemnt în mulțime dacă nu există deja și sortează mulțimea
        if( o == null)
            throw new IllegalArgumentException("Nu se accepta null");

        if(cmp == null && !(o instanceof Comparable))
            throw new ClassCastException("Comparator null");

        int i = 0;
        for(Object obj : this) {
            int comp;
            if(cmp != null)
                comp = cmp.compare(o, obj);
            else
                comp = ((Comparable) o ).compareTo(obj);

            if(comp == 0) //duplicat
                return false;;

            if(comp < 0) {
                super.add(i, o);
                return true;
            }
            i++;
        }
        return super.add(o);
    }

    @Override
    public Object first() { //primul obiect din mulțime
        if(isEmpty())
            throw  new NoSuchElementException();
        return getFirst();
    }

    @Override
    public Object last() { // ultimul obiect din mulțime
        if(isEmpty())
            throw  new NoSuchElementException();
        return getLast();
    }

    @Override
    public SortedSet subSet(Object from, Object to) { // copie ordonată a intervalului [from, to)
        SListSet subset = new SListSet(cmp);
        for (Object obj : this) {
            int compFrom;
            int compTo;

            if (cmp != null) {
                compFrom = cmp.compare(obj, from);
                compTo = cmp.compare(obj, to);
            } else {
                compFrom = ((Comparable) obj).compareTo(from);
                compTo = ((Comparable) obj).compareTo(to);
            }

            if (compFrom >= 0 && compTo < 0)
                subset.add(obj);
        }
        return subset;
    }

    @Override
    public SortedSet headSet(Object to) { // copie ordonată a intervalului (primul_element, to)
        SListSet head = new SListSet(cmp);
        for (Object obj : this) {
            int compTo;
            if (cmp != null)
                compTo = cmp.compare(obj, to);
            else
                compTo = ((Comparable) obj).compareTo(to);


            if (compTo < 0)
                head.add(obj);
        }
        return head;
    }

    @Override
    public SortedSet tailSet(Object from) { // copie ordonată a intervalului [from, ultimul_element)
        SListSet tail = new SListSet(cmp);
        for (Object obj : this) {
            int compFrom;
            if (cmp != null)
                compFrom = cmp.compare(obj, from);
            else
                compFrom = ((Comparable) obj).compareTo(from);

            if (compFrom >= 0) {
                tail.add(obj);
            }
        }

        return tail;
    }

    @Override
    public SListSet reversed() { // întoarce o copie a mulțimii ordonată descrescător, construită pe baza comparatorului curent (dacă există) sau a ordinii naturale; populați exclusiv din elementele setului curent, fără recitirea fișierului și fără sortări/inversări externe.
        Comparator<Object> reversedCmp;

        if (cmp != null)
            reversedCmp = new ReverseComparator(cmp);
        else
            reversedCmp = new NaturalComparator();

        SListSet reversedSet = new SListSet(reversedCmp);
        for (Object obj : this) {
            reversedSet.add(obj);
        }

        return reversedSet;
    }
}
