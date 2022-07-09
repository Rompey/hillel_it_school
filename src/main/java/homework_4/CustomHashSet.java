package homework_4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CustomHashSet<E> implements Set<E> {

    public transient HashMap<E, Object> map;

    private static final Object PRESENT = new Object();

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @SuppressWarnings("SuspiciousMethodCalls")
    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @SuppressWarnings("SuspiciousMethodCalls")
    @Override
    public Object[] toArray() {
        return new Object[]{map.get(new Object[map.size()])};
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}

