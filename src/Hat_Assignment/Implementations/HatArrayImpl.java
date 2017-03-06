package Hat_Assignment.Implementations;

import Hat_Assignment.interfaces.Hat;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author Stephen Adu
 */
public class HatArrayImpl<T extends Number> implements Hat<T> {

    private Object[] array;
    private int size = 0;
    private SecureRandom r = new SecureRandom();

    public HatArrayImpl(){
        this.array = new Object[16];
    }

    /**
     * @return Returns <b>true</b> if empty, <b>false</b> if > 0 elements
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @return Returns size the size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * @param item The item to place into the collection
     */
    @Override
    public void give(T item) {
        if (size == array.length){
            array = Arrays.copyOf(array, (int) (size * 1.5));
        }
        array[size] = item;
        size++;
    }

    /**
     * @return Returns a removes and returns a random element from the collection
     */
    @Override
    public T take() {
        if (isEmpty()){
            throw new EmptyStackException();
        }

        int index = r.nextInt(size);
        T value = (T) array[index];
        array[index] = array[size-1];
        size--;

        if(size < array.length/2){
            if (array.length / 2 < 1){
                array = Arrays.copyOf(array, 1);
            }else{
                array = Arrays.copyOf(array, array.length / 2);
            }
        }

        return value;
    }

}
