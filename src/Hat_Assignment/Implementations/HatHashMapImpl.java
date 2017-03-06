package Hat_Assignment.Implementations;

import Hat_Assignment.interfaces.Hat;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Stephen Adu
 */
public class HatHashMapImpl<T> implements Hat<T> {

    private HashMap<Integer,T> collection = new HashMap<>();
    private List<Integer> keyList = new ArrayList<>();
    private SecureRandom random = new SecureRandom();

    private int counter = 0;


    /**
     * @return Returns <b>true</b> if empty, <b>false</b> if > 0 elements
     */
    @Override
    public boolean isEmpty() {
        return collection.isEmpty();
    }

    /**
     * @return Returns size the size
     */
    @Override
    public int size() {
        return collection.size();
    }

    /**
     * @param item The item to place into the collection
     */
    @Override
    public void give(T item) {
        counter++;
        collection.put(counter,item);
    }

    /**
     * @return Returns a removes and returns a random element from the collection
     */
    @Override
    public T take() {
        counter--;
        return collection.remove(getxRandomKey());
    }

    /**
     * @return Returns random Index
     */
    private T getxRandomKey(){
        return collection.get(random.nextInt(collection.keySet().size()));
    }
}
