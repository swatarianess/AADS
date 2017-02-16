package Hat_Assignment;

/**
 * Created by Stephen A. on 16/02/2017.
 */
public interface Hat<T> {

    boolean isEmpty();
    int size();
    void give(T item);
    T take();
}
