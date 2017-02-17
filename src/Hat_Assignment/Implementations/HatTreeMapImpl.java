package Hat_Assignment.Implementations;

import Hat_Assignment.Hat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

/**
 * Created by Stephen Adu on 17/02/2017.
 */
public class HatTreeMapImpl<T> implements Hat<T> {

    private TreeMap<Integer,T> treeMap = new TreeMap<>();
    private List<Integer> keys = new ArrayList<>(treeMap.keySet());

    /**
     * @return Returns <b>true</b> if empty, <b>false</b> if > 0 elements
     */
    @Override
    public boolean isEmpty() {
        return false;
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
        treeMap.put(treeMap.lastKey()+1,item);
    }

    /**
     * @return Returns a removes and returns a random element from the collection
     */
    @Override
    public T take() {
        Random r = new Random();
        int randomIndex = keys.get(r.nextInt(keys.size()));
        return treeMap.remove(randomIndex);
    }
}
