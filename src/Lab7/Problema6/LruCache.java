package Lab7.Problema6;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache extends LinkedHashMap {
    private final int capacity;

    public LruCache(int capacity) { // seteaza access-order = true
        super(capacity, 0.75f, true);
        if (capacity <= 0)
            throw new IllegalArgumentException("Capacitatea trebuie sa fie strict pozitiva");

        this.capacity = capacity;

    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) { // eliminare cand size() > capacity
        return size() > capacity;
    }
}

