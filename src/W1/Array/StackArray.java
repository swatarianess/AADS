package W1.Array;

/**
 * Created by Stephen Adu on 09/02/2017.
 */
public interface StackArray<T> {

    void push(T element);

    T pop() throws Exception;

    boolean isEmpty();

    int size();

    String toString();

}
