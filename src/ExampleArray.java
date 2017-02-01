import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Stephen A. on 31/01/2017.
 */
public class ExampleArray {

    private int stackOfints_array[];
    private int stackOfIntsSize;

    public ExampleArray(int sizeOfArray){
        this.stackOfIntsSize = sizeOfArray;
        this.stackOfints_array = new int[sizeOfArray];
    }

    public static void main(String[] args){

    }

    /**
     *  Pushes item into the datastructure
     *
     * @param item Integer to push into the datastruture
     */
    public void push(int item){
        if(stackOfints_array.length == stackOfIntsSize){
            //Full
            System.out.println("Full");
            int newSize = stackOfIntsSize*2;
            int tempStorage[] = new int[newSize];
            tempStorage = stackOfints_array;
            stackOfints_array = tempStorage;

        }else{

        }
    }

    /**
     * @param input The integer to pop into the datastructure
     * @return Returns the last item in the array and returns it.
     */
    public int pop(int input){

        return 0;
    }


}
