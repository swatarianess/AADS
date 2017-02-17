package Hat_Assignment;

/**
 * Created by Stephen A. on 16/02/2017.
 */
public interface Hat<T> {

    /**
     * @return Returns <b>true</b> if empty, <b>false</b> if > 0 elements
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
