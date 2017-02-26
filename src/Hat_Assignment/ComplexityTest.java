package Hat_Assignment;

import Hat_Assignment.Implementations.HatHashMapArrayListImpl;
import Hat_Assignment.Implementations.HatLinkedListImpl;
import Hat_Assignment.Implementations.HatTreeMapImpl;
import Hat_Assignment.util.Timer;

import java.security.SecureRandom;


/**
 * Created by Stephen A.
 */
public class ComplexityTest {


    public static void main(String[] args){
        ComplexityTest complexityTest = new ComplexityTest();
        int maxSize = 3500000; //2,097,152
        System.out.println("\nTest: Hat with LinkedList implementation");

        //Test Hat with LinkedList Implementation
        for(int i = 1; i <= maxSize; i*=2) {
            complexityTest.testHatLinkedlist(i);
        }

        System.out.println("======================================================");

        System.out.println("\nTest: Hat with HashMap-ArrayList combination implementation");

        //Test hat with HashMap_ArrayList implementation
        for(int i=1; i <= maxSize; i*=2) {
            complexityTest.testHatHashMapArrayList(i);
        }

        System.out.println("======================================================");

        System.out.println("\nTest: Hat with Tree-map combination implementation");

        //Test hat with Tree_Map implementation
        for (int i = 1; i < maxSize; i*=2) {
            complexityTest.testHatTreeMap(i);
        }

        
    }

    private void testHatLinkedlist(int setSize){
        HatLinkedListImpl<Integer> hatLinkedList = new HatLinkedListImpl<>();
        SecureRandom r = new SecureRandom();
        Timer t = new Timer();

        System.out.println("Give() & Take()");

        //Populate Collection with Integers
        t.start();
        for(int i = 0; i < setSize; i++)
            hatLinkedList.give(r.nextInt());
        formatTimeTaken(setSize,t.getElapsedTime());


        //Take element from collection
        t.start();
        formatTimeTaken(setSize,t.getElapsedTime());

        System.out.println();

    }

    private void testHatHashMapArrayList(int setSize){
        HatHashMapArrayListImpl<Integer> hatHashMapArrayList = new HatHashMapArrayListImpl<>();
        SecureRandom r = new SecureRandom();
        Timer t = new Timer();

        System.out.println("Give() & Take()");
        //Execute give method on collection
        t.start();

        for (int i = 0; i < setSize; i++)
        hatHashMapArrayList.give(r.nextInt());

        formatTimeTaken(setSize,t.getElapsedTime());

        //Execute take from collection
        t.start();
        hatHashMapArrayList.take();
        formatTimeTaken(setSize,t.getElapsedTime());

        System.out.println();

    }

    private void testHatTreeMap(int setSize){
        HatTreeMapImpl<Integer> hatTreeMap = new HatTreeMapImpl<>();
        SecureRandom r = new SecureRandom();
        Timer t = new Timer();

        System.out.println("Give() & Take()");
        t.start();
        for (int i = 0; i < setSize; i++) {
            hatTreeMap.give(r.nextInt());
        }
        formatTimeTaken(setSize,t.getElapsedTime());

        //Execute Take
        t.start();
        hatTreeMap.take();
        formatTimeTaken(setSize,t.getElapsedTime());

        System.out.println();

    }

    private void formatTimeTaken(int setSize, double timeTaken){
        System.out.println(String.format("%s : %s", setSize, timeTaken));
    }

    private void addToJsonArray(String s, int value){

    }


}
