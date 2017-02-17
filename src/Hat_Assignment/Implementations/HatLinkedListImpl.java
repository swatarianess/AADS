package Hat_Assignment.Implementations;

import Hat_Assignment.Hat;
import java.util.LinkedList;

/**
 * Created by Stephen A. on 16/02/2017.
 */
public class HatLinkedListImpl<T> implements Hat<T> {

    private LinkedList<T> storage = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public void give(T item) {
        storage.add(item);
    }

    @Override
    public T take() {
        int randomIndex = (int) (Math.random()*storage.size());
        return storage.remove(randomIndex);
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
