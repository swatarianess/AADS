package Hat_Assignment.Implementations;

import Hat_Assignment.interfaces.Hat;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Stephen A.
 */
public class HatTreeMapImpl<T> implements Hat<T> {

    private TreeMap<Integer,T> treeMap = new TreeMap<>();
    private List<Integer> keys = new ArrayList<>(treeMap.keySet());
    private int index = -1;

    /**
     * @return Returns <b>true</b> if empty, <b>false</b> if > 0 elements
     */
    @Override
    public boolean isEmpty() {
        return keys.isEmpty() && treeMap.isEmpty();
    }

    /**
     * @return Returns size the size
     */
    @Override
    public int size() {
        return treeMap.size();
    }

    /**
     * @param item The item to place into the collection
     */
    @Override
    public void give(T item) {
        index++;
        treeMap.put(index,item);
        keys.add(index);
    }

    /**
     * @return Returns a removes and returns a random element from the collection
     */
    @Override
    public T take() {
        SecureRandom r = new SecureRandom();
        int randomIndex = keys.get(r.nextInt(keys.size()));
        return treeMap.remove(randomIndex);
    }
}
