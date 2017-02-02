import java.util.Arrays;
import java.util.EmptyStackException;

import java.io.PrintStream;

/**
 *  Stack implementation on an Array
 *
 * Created by Stephen A. on 31/01/2017.
 */
public class StackArrayExample {

    private int top;
    private int[] stackOfInts_array;
    private final int stackSize;
    private final static PrintStream p = System.out;

    private StackArrayExample(int arraySize){
        this.stackSize = arraySize;
        this.stackOfInts_array = new int[arraySize];
        this.top = -1;
    }

    public static void main(String[] args) throws Exception {
        StackArrayExample stackArray = new StackArrayExample(10);
        stackArray.push(1,2,3,4,5,6,7,8,9,10);

        p.println(stackArray);
        p.println();

        p.println("Pop!");
        p.println(stackArray.pop());
        p.println(stackArray.remainingSpace());
        p.println(stackArray);
        p.println();

        p.println("Pop!");
        p.println(stackArray.pop());
        p.println(stackArray.remainingSpace());
        p.println(stackArray);
        p.println();

        p.println("Pop!");
        p.println(stackArray.pop());
        p.println(stackArray.remainingSpace());
        p.println(stackArray);
        p.println();

    }

    /**
     *  Pushes item into the array
     *
     * @param value Integer to push into the stack
     */
    @SuppressWarnings("unused")
    public void push(int value){
        if(top == stackSize-1){
            //Full
            p.println("Stack is full. Cannot push value: " + value);
        }else{
            //Move pointer to next position and add value
            top++;
            stackOfInts_array[top] = value;
        }
    }

    /**
     *  Pushes multiple items into the array
     *
     * @param value Integer to push into the data-structure
     */
    private void push(int... value){
        boolean overflow = (value.length + top) >= stackSize;
        if(!overflow) {
            if (top == stackSize - 1) {
                //Full
                p.println("Stack is full.");
                p.println(remainingSpace());
            } else {
                //Move pointer to next position and add value
                p.println(remainingSpace());
                for (int aValue : value) {
                    top++;
                    stackOfInts_array[top] = aValue;
                    p.println(remainingSpace());
                }
            }
        } else {
            throw new StackOverflowError("Stack overflow.");

        }
    }


    /**
     *  Moves current position back one place as to overwrite last item in the Stack
     */
    private int pop() throws Exception {
        int valueOfTop = stackOfInts_array[top];
        if(!isEmpty()) {
            stackOfInts_array[top] = 0;
            top--;
            return valueOfTop;
        } else{
            throw new EmptyStackException();
        }
    }

    private boolean isEmpty(){
        return top==-1;
    }

    private String remainingSpace(){
        int remainingSpace = stackSize - (top+1);
        return "Space: (" + remainingSpace + "/" + stackSize + ")";

    }

    @Override
    public String toString() {
        return Arrays.toString(stackOfInts_array);
    }
}
