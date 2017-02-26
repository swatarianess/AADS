package Hat_Assignment.Implementations;

import Hat_Assignment.Hat;

import java.util.Hashtable;

/**
 * Created by Stephen Adu on 26/02/2017.
 */
public class HatHashTableImpl<T> implements Hat<T> {

    private Hashtable<Integer,T> integerTHashtable = new Hashtable<>();
    private int counter = 0;

    /**
     * @return Returns <b>true</b> if empty, <b>false</b> if > 0 elements
     */
    @Override
    public boolean isEmpty() {
        return integerTHashtable.isEmpty();
    }

    /**
     * @return Returns size the size
     */
    @Override
    public int size() {
        return integerTHashtable.size();
    }

    /**
     * @param item The item to place into the collection
     */
    @Override
    public void give(T item) {
        counter++;
        integerTHashtable.keySet().add(counter);
        integerTHashtable.put(counter,item);
    }

    /**
     * @return Returns a removes and returns a random element from the collection
     */
    @Override
    public T take() {
        return null;
    }
}
