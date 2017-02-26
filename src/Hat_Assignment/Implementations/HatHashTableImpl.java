package Hat_Assignment.Implementations;

import Hat_Assignment.interfaces.Hat;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Stephen A.
 */
public class HatHashTableImpl<T> implements Hat<T> {

    private Hashtable<Integer,T> integerHashtable = new Hashtable<>();
    private List<Integer> keys = new ArrayList<>(integerHashtable.keySet());
    private int counter = -1;

    /**
     * @return Returns <b>true</b> if empty, <b>false</b> if > 0 elements
     */
    @Override
    public boolean isEmpty() {
        return integerHashtable.isEmpty();
    }

    /**
     * @return Returns size the size
     */
    @Override
    public int size() {
        return integerHashtable.size();
    }

    /**
     * @param item The item to place into the collection
     */
    @Override
    public void give(T item) {
        counter++;
        integerHashtable.put(counter,item);
        keys.add(counter);

    }

    /**
     * @return Returns a removes and returns a random element from the collection
     */
    @Override
    public T take() {
        SecureRandom r = new SecureRandom();
        int randomIndex = r.nextInt(integerHashtable.keySet().size());
        return integerHashtable.remove(randomIndex);

    }
}
