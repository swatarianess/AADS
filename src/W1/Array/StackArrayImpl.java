package W1.Array;

import java.util.Arrays;
import java.util.EmptyStackException;

import java.io.PrintStream;

/**
 *  Stack implementation on an Array
 *
 * Created by Stephen A. on 31/01/2017.
 */
public class StackArrayImpl<T> implements StackArray<T> {

    private int top;
    private int count;
    private int stackSize;
    private T[] stackArray;
    private final static PrintStream p = System.out;

    @SuppressWarnings("unchecked")
    public StackArrayImpl(int arraySize){
        this.stackSize = arraySize+1;
        this.stackArray = (T[]) new Object[arraySize];
        this.top = -1;
        this.count = 0;
    }

    /**
     *  Pushes item into the array
     *
     * @param value Integer to push into the stack
     */
    @SuppressWarnings("unchecked")
    public void push(Object value){
        if(top == stackSize-1){
            p.println("Stack is full, increasing stack size.");
            incrementStackSize();
            push(value);
            count++;
        }else{
            //Move pointer to next position and add value
            top++;
            stackArray[top] = (T) value;
            count++;
        }
    }

    /**
     *  Pushes multiple items into the array
     *
     * @param value Integer to push into the data-structure
     */
    @SuppressWarnings("unchecked")
    public void push(Object... value){
        boolean overflow = (value.length + top) >= stackSize;
        if(!overflow) {
            if (top == stackSize - 1) {
                //Full
                p.println("Stack is full.");
            } else {
                //Move pointer to next position and add value
                for (Object aValue : value) {
                    top++;
                    stackArray[top] = (T) aValue;
                    count++;
                }
            }
        } else {
            //throw new StackOverflowError("Stack overflow.");
            incrementStackSize();
            push(value);
            count++;
        }
    }

    /**
     *  Moves current position back one place as to overwrite last item in the Stack
     */
    @SuppressWarnings("unchecked")
    public T pop() throws Exception {
        Object valueOfTop = stackArray[top];
        if(!isEmpty()) {
//            stackArray[top] = null;
            decrementStackSize();
            top--;
            count--;
            return (T) valueOfTop;
        } else{
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    /**
     * @return Returns the amount of free slots in the stack
     */
    public int remainingSpace(){
        return stackSize - (top + 1);
    }

    /**
     * @return Returns the size of the stack
     */
    public int size(){ return stackSize;}

    public int getCount(){return count;}

    /**
     * Increases the size of the stack by the given value
     */
    private void incrementStackSize() {
        incrementStackSize(stackSize);
    }

    /**
     *  Decreases the size of the stack by 1.
     */
    @SuppressWarnings("unchecked")
    private void decrementStackSize(){
        int newSize = stackSize - 1;
        Object[] smallerArray = new Object[newSize];
        System.arraycopy(stackArray, 0, smallerArray, 0, newSize);
        stackArray = (T[]) smallerArray;
        stackSize = newSize;
    }

    /**
     *  Decreases the size of the stack by the given value
     *
     * @param decrementAmount Amount to decrement stack size by.
     */
    @SuppressWarnings("unchecked")
    private void decrementStackSize(int decrementAmount){
        if ((decrementAmount >= stackSize)) {
            throw new StackOverflowError("Cannot have negative size array.");
        } else {
            stackSize -= decrementAmount;
            Object[] largerArray = new Object[stackSize];
            System.arraycopy(stackArray, 0, largerArray, 0, stackSize);
            stackArray = (T[]) largerArray;
        }
    }

    /**
     * Increases the size of the stack by the given value
     *
     * @param incrementAmount Amount to increment stack size by.
     */
    @SuppressWarnings("unchecked")
    private void incrementStackSize(int incrementAmount){
        stackSize += incrementAmount;
        Object[] largerArray = new Object[stackSize];
        System.arraycopy(stackArray,0,largerArray,0,stackArray.length);
        stackArray = (T[]) largerArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(stackArray);
    }
}
