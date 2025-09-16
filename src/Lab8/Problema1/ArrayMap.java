package Lab8.Problema1;

import java.util.*;

public class ArrayMap<K, V> extends AbstractMap<K, V> {
    private final List<ArrayMapEntry<K, V>> entries = new ArrayList<>();

    @Override
    public Set entrySet() {
        return new HashSet<>(entries);
    }

    @Override
    public int size() {
        return entries.size();
    }

    @Override
    public V put(K key, V value) {
        for (ArrayMapEntry<K, V> entry: entries) {
            if (Objects.equals(entry.getKey(), key)) {
                V oldValue = entry.getValue();
                entry.setValue(value);
                return oldValue;
            }
        }
        entries.add(new ArrayMapEntry<>(key, value));
        return null;
    }

    public static class ArrayMapEntry<K, V> implements Map.Entry<K, V> {
        private K key;
        private V value;

        public ArrayMapEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return value;
        }

        @Override
        public String toString() {
            return "Key: " + key + ", Value: " + value;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof Map.Entry))
                return false;
            Map.Entry<?, ?> other = (Map.Entry<?, ?>) obj;
            return Objects.equals(key, other.getKey()) && Objects.equals(value, other.getValue());
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }


}