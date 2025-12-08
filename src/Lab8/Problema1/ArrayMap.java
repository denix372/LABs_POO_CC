package Lab8.Problema1;

import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {

    private ArrayList<ArrayMapEntry<K, V>> dict = new ArrayList<>();

    public class ArrayMapEntry<K, V> implements Map.Entry<K, V> {
        private K key;
        private V value;

        public ArrayMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
        public V setValue(V value) {
            V old = this.value;
            this.value = value;
            return old;
        }

        public String toString() {
            return "Key: " + key + "Value: " + value;
        }

        public boolean equals(Object o) {
            if(!(o instanceof Map.Entry))
                return false;
            Map.Entry<?, ?> a = (Map.Entry<?, ?> ) o;
            return Objects.equals(key, a.getKey()) &&
                    Objects.equals(value, a.getValue());
        }
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    @Override
    public Set entrySet() {
        return new HashSet(dict);
    }

    @Override
    public int size() {
        return dict.size();
    }

    @Override
    public V put(K key, V value) {
        for (ArrayMapEntry<K, V> d : dict)
            if (Objects.equals(d.getKey(), key))
                return d.setValue(value);
        dict.add(new ArrayMapEntry<>(key, value));
        return null;
    }
}
