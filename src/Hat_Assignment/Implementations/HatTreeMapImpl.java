package Hat_Assignment.Implementations;

import Hat_Assignment.interfaces.Hat;

import java.security.SecureRandom;
import java.util.TreeMap;

/**
 * Created by Stephen A. & Semida A.
 */
public class HatTreeMapImpl<T> implements Hat<T> {

    private TreeMap<Integer,T> treeMap = new TreeMap<>();

    /**
     * @return Returns <b>true</b> if empty, <b>false</b> if > 0 elements
     */
    @Override
    public boolean isEmpty() {
        return treeMap.size() == 0;
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
        treeMap.put(treeMap.size(),item);
    }

    /**
     *  Removes random Item from the collection. Uses counter to keep count of Size
     *
     * @return Returns a removes and returns a random element from the collection
     */
    @Override
    public T take() {
        SecureRandom r = new SecureRandom();
        return treeMap.remove(r.nextInt(size()));
    }
}
