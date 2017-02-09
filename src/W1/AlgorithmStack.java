package W1;

/**
 * Created by Stephen A. on 07/02/2017.
 */
public class AlgorithmStack {

    private StackArrayExample example;

    @SuppressWarnings("unchecked")
    public AlgorithmStack(int sizeOfArray){
        example = new StackArrayExample<Integer>(sizeOfArray);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        AlgorithmStack aStack = new AlgorithmStack(10);
        aStack.example.push(10,20,30,40,50);

        AlgorithmStack sStack = new AlgorithmStack(5);
        sStack.example.push("hello","world","!");

        System.out.println();

        System.out.println("Top of int stack: " + aStack.showTopOfStack());
        System.out.println("Top of string stack: " + sStack.showTopOfStack());

        System.out.println();

        System.out.println("Integer stack contents: \n" + aStack);
        System.out.println("Bottom of Integer stack: \n" + aStack.showBottomOfStack());

        System.out.println();

        System.out.println("String stack contents: \n" + sStack);
        System.out.println("Bottom of string stack: \n" + sStack.showBottomOfStack());
    }

    public Object showTopOfStack() throws Exception {
        StackArrayExample s = example;
        Object top = s.pop();
        s.push(top);
        return top;
    }

    public Object removeTopOfStack() throws Exception {
        StackArrayExample s = example;
        return s.pop();
    }

    public Object showBottomOfStack() throws Exception {
        StackArrayExample s = example;
        Object[] temp = new Object[s.getStackSize()];

        for(int i=0;i<s.getStackSize()-1;i++){
            temp[i] = s.pop();
        }

        return temp[s.getStackSize()];
    }

    /**
     * @return Returns all elements in the stack
     */
    @Override
    public String toString() {
        return example.toString();
    }
}
