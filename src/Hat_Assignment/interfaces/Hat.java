package Hat_Assignment.interfaces;

/**
 * Created by Stephen A.
 */
public interface Hat<T> {

    /**
     * @return Returns <b>true</b> if empty, <b>false</b> if more than 0 elements
     */
    boolean isEmpty();

    /**
     * @return Returns size the size
     */
    int size();

    /**
     * @param item The item to place into the collection
     */
    void give(T item);


    /**
     * @return Returns a removes and returns a random element from the collection
     */
    T take();
}
