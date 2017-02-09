package W1;

import java.util.Arrays;
import java.util.EmptyStackException;

import java.io.PrintStream;

/**
 *  Stack implementation on an Array
 *
 * Created by Stephen A. on 31/01/2017.
 */
public class StackArrayExample<T> {

    private int top;
    private int stackSize;
    private T[] stackArray;
    private final static PrintStream p = System.out;

    public StackArrayExample(int arraySize){
        this.stackSize = arraySize;
        this.stackArray = (T[]) new Object[arraySize];
        this.top = -1;
    }

    /**
     *  Pushes item into the array
     *
     * @param value Integer to push into the stack
     */
    public void push(Object value){
        if(top == stackSize-1){
            p.println("Stack is full, increasing stack size.");
            incrementStackSize();
            push(value);
        }else{
            //Move pointer to next position and add value
            top++;
            stackArray[top] = (T) value;
        }
    }

    /**
     *  Pushes multiple items into the array
     *
     * @param value Integer to push into the data-structure
     */
    public void push(Object... value){
        boolean overflow = (value.length + top) >= stackSize;
        if(!overflow) {
            if (top == stackSize - 1) {
                //Full
                p.println("Stack is full.");
                p.println(remainingSpace());
            } else {
                //Move pointer to next position and add value
                p.println(remainingSpace());
                for (Object aValue : value) {
                    top++;
                    stackArray[top] = (T) aValue;
                    p.println(remainingSpace());
                }
            }
        } else {
            //throw new StackOverflowError("Stack overflow.");
            incrementStackSize();
            push(value);
        }
    }

    /**
     *  Moves current position back one place as to overwrite last item in the Stack
     */
    public T pop() throws Exception {
        T valueOfTop = stackArray[top];
        if(!isEmpty()) {
            stackArray[top] = null;
            decrementStackSize();
            top--;
            return valueOfTop;
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
    public String remainingSpace(){
        int remainingSpace = stackSize - (top+1);
        return "Space: (" + remainingSpace + "/" + stackSize + ")";
    }

    /**
     * @return Returns the size of the stack
     */
    public int getStackSize(){ return this.stackSize;}

    /**
     * @param size The size to set the stack
     */
    public void setStackSize(int size){ this.stackSize = size;}

    /**
     * Increases the size of the stack by the given value
     */
    private void incrementStackSize() {
        incrementStackSize(getStackSize());
    }

    /**
     *  Decreases the size of the stack by 1.
     */
    private void decrementStackSize(){
        setStackSize(getStackSize() - 1);
        Object[] largerArray = new Object[getStackSize()];
        System.arraycopy(stackArray, 0, largerArray, 0, getStackSize());
        stackArray = (T[]) largerArray;
    }

    /**
     *  Decreases the size of the stack by the given value
     *
     * @param decrementAmount Amount to decrement stack size by.
     */
    private void decrementStackSize(int decrementAmount){
        if ((decrementAmount >= getStackSize())) {
            throw new StackOverflowError("Cannot have negative size array.");
        } else {
            setStackSize(getStackSize() - decrementAmount);
            Object[] largerArray = new Object[getStackSize()];
            System.arraycopy(stackArray, 0, largerArray, 0, getStackSize());
            stackArray = (T[]) largerArray;
        }
    }

    /**
     * Increases the size of the stack by the given value
     *
     * @param incrementAmount Amount to increment stack size by.
     */
    private void incrementStackSize(int incrementAmount){
        setStackSize(getStackSize()+incrementAmount);
        Object[] largerArray = new Object[getStackSize()];
        System.arraycopy(stackArray,0,largerArray,0,stackArray.length);
        stackArray = (T[]) largerArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(stackArray);
    }
}
