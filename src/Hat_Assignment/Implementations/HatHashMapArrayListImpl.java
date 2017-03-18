package Hat_Assignment.Implementations;

import Hat_Assignment.interfaces.Hat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Stephen A. and Semida A.
 */
public class HatHashMapArrayListImpl<T> implements Hat<T> {

    private ArrayList<T> arrayObjects;              // Resizable arrayObjects containing the objects
    private HashMap<T,Integer> integerHashMap;      // A hashMap where keys are arrayObjects element and values are indexes in the arrayObjects

    /**
     *  Constructor for The class.
     *  Initializes {@link #arrayObjects} and {@link #integerHashMap}.
     */
    public HatHashMapArrayListImpl(){
        arrayObjects = new ArrayList<>();
        integerHashMap = new HashMap<>();
    }

    /**
     *  Checks if the Collection of objects in {@link #arrayObjects}
     *
     * @return Returns <b>true</b> if arrayObjects or hashMap is empty, <b>false</b> otherwise.
     */
    @Override
    public boolean isEmpty() {
        return arrayObjects.isEmpty();
    }

    /**
     *  Returns size of the collection that contains the objects.
     *
     * @return Returns the amount of items in the {@link #arrayObjects}, which holds the objects.
     */
    @Override
    public int size() {
        return arrayObjects.size();
    }

    /**
     *  Checks whether the argument <code>item</code> already exists, if <b>true</b> it returns.
     *  If <b>false</b>, adds argument <code>item</code> to the collection for storing objects {@link #arrayObjects}.
     *  Also, adds argument <code>item</code> to HashMap as key, {@link ArrayList#size()} as value.
     *
     * @param item The object to add to the collections; {@link #arrayObjects} and {@link #integerHashMap}
     */
    @Override
    public void give(T item) {
        if (integerHashMap.get(item) != null)       // If Object already exists, we won't add it again
        return;                                     // Returns

        int s = arrayObjects.size();                // Object index = Position in the arrayObjects
        arrayObjects.add(item);                     // Add Object to arrayObjects
        integerHashMap.put(item,s);                 // Add Object and Index (Position in arrayObjects)

    }

    /**
     *  Removes random object from {@link #arrayObjects}.
     *
     * @return Returns a random Object from the Collection
     */
    @Override
    public T take() {
        int index = getRandomIndex();               // Get random index
        T targetObject = arrayObjects.get(index);   // Gets random element from arrayObjects

        arrayObjects.remove(targetObject);          // Remove object from arrayObjects
        integerHashMap.remove(targetObject);        // Remove index from hashMap

        return targetObject;                        // Returns the Object to be removed.

    }

    /**
     *  Gets random Index from {@link #arrayObjects}
     *
     * @return Returns a random index from the arrayObjects
     */
    private int getRandomIndex(){
        Random r = new Random();                    // Create Random Object. Note: SecureRandom and Random are similar
        return r.nextInt(arrayObjects.size());      // Returns random index from the arrayObjects collection.
    }

    @Override
    public String toString() {
        return arrayObjects.toString();             // Returns the collection of objects.
    }
}
