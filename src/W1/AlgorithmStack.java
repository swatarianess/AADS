package W1;

import W1.Array.StackArrayImpl;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Stephen A. on 07/02/2017.
 */
public class AlgorithmStack {

    @SuppressWarnings("unchecked")
    public AlgorithmStack(){
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        //Initialize AlgorithmStack
        AlgorithmStack algorithmStack = new AlgorithmStack();
        StackArrayImpl integerStackArray = new StackArrayImpl<>(10);
        StackArrayImpl stringStackArray = new StackArrayImpl<>(10);

        //Push elements to stack arrays
        integerStackArray.push(10,20,30,40,50);
        stringStackArray.push("hi","world","how","goes","it");
        //

        System.out.println();

        System.out.println("Top of int stack: " + algorithmStack.showTopOfStack(integerStackArray));
        System.out.println("Top of string stack: " + algorithmStack.showTopOfStack(stringStackArray));

        System.out.println();

        System.out.println(String.format("Integer Stack[%d]: %s",integerStackArray.size(),integerStackArray));
        System.out.println("Bottom of Integer stack: " + algorithmStack.showBottomOfStack(integerStackArray));
        System.out.println(String.format("Integer Stack[%d]: %s",integerStackArray.size(),integerStackArray));

        System.out.println();

        System.out.println(String.format("String Stack[%d]: %s",stringStackArray.size(),stringStackArray));
        System.out.println("Bottom of string stack: " + algorithmStack.showBottomOfStack(stringStackArray));
        System.out.println(String.format("String Stack[%d]: %s",stringStackArray.size(),stringStackArray));

    }

    public Object showTopOfStack(StackArrayImpl stackArray) throws Exception {
        Object top = stackArray.pop();
        stackArray.push(top);
        return top;
    }

    public Object removeTopOfStack(StackArrayImpl s) throws Exception {
        return s.pop();
    }

    public Object showBottomOfStack(StackArrayImpl stackArray) throws Exception {
        System.out.println(String.format("Original Array[%d]: %s",stackArray.size(),stackArray));
        reverseArray(stackArray);
        return showTopOfStack(stackArray);
    }

    private StackArrayImpl reverseArray(StackArrayImpl stackArray) throws Exception{
        Object[] objects = new Object[(stackArray.size())];

        for(int i = 0; i < stackArray.size(); i++){
            Object item = stackArray.pop();
            objects[i] = item;
        }

        Collections.reverse(Arrays.asList(objects));
        stackArray.push(objects);

        return stackArray;
    }


    public Object getItem(StackArrayImpl s, int index) throws Exception {
        Object[] temp = new Object[s.size()];

        for (int i = 0; i < temp.length; i++) {
            Object obj = s.pop();
            temp[i] = obj;
        }

        return temp[index];
    }


}
