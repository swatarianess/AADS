package Hat_Assignment.Implementations;

import Hat_Assignment.interfaces.Hat;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Stephen A.
 */
public class HatHashMapArrayListImpl<T> implements Hat<T> {

    private ArrayList<T> array; // Resizable array
    private HashMap<T,Integer> hash; // A hash where keys are array element and values are indexes in the array

    //Creates array and hash
    public HatHashMapArrayListImpl(){
        array = new ArrayList<>();
        hash = new HashMap<>();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public int size() {
        return array.size();
    }

    /**
     * @param item The element to add to the
     */
    @Override
    public void give(T item) {
        //No duplicates
        if (hash.get(item) != null)
        return;

        //Else put element at the end of array[]
        int s = array.size();
        array.add(item);
        hash.put(item,s); //TODO: Find out what this is for?

    }

    @Override
    public T take() {
        int index = getRandom(); // Get random index
        T itemToReturn = array.get(index); //Gets random element from array

        array.remove(itemToReturn);

        return itemToReturn;

    }

    /**
     * @return Returns a random index from the array
     */
    private int getRandom(){
        SecureRandom r = new SecureRandom();
        return r.nextInt(array.size());
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
