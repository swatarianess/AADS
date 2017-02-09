package W1;

import java.util.Arrays;

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
        StackArrayImpl<Integer> integerStackArray = new StackArrayImpl<>(10);
        StackArrayImpl<String> stringStackArray = new StackArrayImpl<>(10);

        //Push elements to stack arrays
        integerStackArray.push(10,20,30,40,50);
        stringStackArray.push("hi","world","how","goes","it");

        System.out.println();

        System.out.println("Top of int stack: " + algorithmStack.showTopOfStack(integerStackArray));
        System.out.println("Top of string stack: " + algorithmStack.showTopOfStack(stringStackArray));

        System.out.println();

        System.out.println("Integer stack [" + integerStackArray.size() + "] contents: \n" + integerStackArray);
        System.out.println("Bottom of Integer stack: \n" + algorithmStack.showBottomOfStack(integerStackArray));

        System.out.println();

        System.out.println("String stack [" + stringStackArray.size() + "]  contents: \n" + stringStackArray);
        System.out.println("Bottom of string stack: \n" + algorithmStack.showBottomOfStack(stringStackArray));
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
        Object[] temp = new Object[(stackArray.size() - stackArray.remainingSpace())];

        for(int i = 0; i < stackArray.size(); i++){
            Object item = stackArray.pop();
            temp[i] = item;
        }

        stackArray.push(temp);

        System.out.println("Origin: " + stackArray);
        System.out.println("Finale: " + Arrays.toString(temp));

        return showTopOfStack(stackArray);
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
