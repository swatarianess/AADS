package Hat_Assignment;

import Hat_Assignment.Implementations.HatHashMapArrayListImpl;
import Hat_Assignment.Implementations.HatLinkedListImpl;
import Hat_Assignment.util.Timer;

import java.security.SecureRandom;

/**
 * Created by Stephen A. on 16/02/2017.
 */
public class ComplexityTest {

    ComplexityTest(){

    }

    public static void main(String[] args){
        ComplexityTest complexityTest = new ComplexityTest();

        System.out.println("\nTest: Hat with LinkedList implementation");

        //Test Hat with LinkedList Implementation
        for(int i = 1; i <= 9000000; i*=2)
            complexityTest.testHatLinkedlist(i);



//        System.out.println("\nTest: Hat with HashMap-ArrayList combination implementation");
//
//        //Test hat with HashMap_ArrayList implementation
//        complexityTest.testHatHashMapArrayList();

    }

    private void testHatLinkedlist(int iterations){
        HatLinkedListImpl<Integer> hatA = new HatLinkedListImpl<>();
        HatLinkedListImpl<String> hatB = new HatLinkedListImpl<>();
        HatLinkedListImpl<Double> hatC = new HatLinkedListImpl<>();
        SecureRandom r = new SecureRandom();
        Timer t = new Timer();

        System.out.println("Method= Give()");

        //Populate Collection with Integers
        t.start();
        for(int i = 0; i < iterations; i++)
            hatA.give(r.nextInt());
        System.out.println(String.format("Collection Type:Integer | Time for i[%s]: %s ", iterations, t.getElaspedTime()));

        System.out.println("Method= Take()");

        //Take element from collection
        t.start();
        hatA.take();
        System.out.println(String.format("Collection Type:Integer Method= Take(), Time for i[%s]: %s ", iterations, t.getElaspedTime()));

        System.out.println();

    }

    private void testHatHashMapArrayList(){

        HatHashMapArrayListImpl<String> hatA = new HatHashMapArrayListImpl<>();
        HatHashMapArrayListImpl<Integer> hatB = new HatHashMapArrayListImpl<>();
        HatHashMapArrayListImpl<Double> hatC = new HatHashMapArrayListImpl<>();

        hatA.give("Hello");
        hatA.give("world");
        hatA.give("1");
        hatA.give("2");
        hatA.give("3");

        hatB.give(1);
        hatB.give(2);
        hatB.give(3);
        hatB.give(4);
        hatB.give(5);

        hatC.give(1.00);
        hatC.give(1.50);
        hatC.give(2.00);
        hatC.give(2.50);
        hatC.give(3.00);



    }


}
