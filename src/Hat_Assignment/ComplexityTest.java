package Hat_Assignment;

import Hat_Assignment.Implementations.HatArrayImpl;
import Hat_Assignment.Implementations.HatHashMapArrayListImpl;
import Hat_Assignment.Implementations.HatHashMapImpl;
import Hat_Assignment.Implementations.HatHashTableImpl;
import Hat_Assignment.Implementations.HatLinkedListImpl;
import Hat_Assignment.Implementations.HatTreeMapImpl;
import Hat_Assignment.util.Timer;

import java.util.Random;

/**
 * Created by Stephen A.
 */
public class ComplexityTest {

    public static void main(String[] args) {
        ComplexityTest complexityTest = new ComplexityTest();
        int maxSize = 2100000; //Greater than 2,100,000 and Java Heap Error thrown

        System.out.println("======================================================");

        System.out.println("\nTest: Hat with HashMap + ArrayList combination implementation");
        System.out.println("\nMethodType | Datastructure Size : Time(Nano-seconds)");

        //Test hat with Tree_Map implementation
        for (int i = 1; i < maxSize; i *= 2) {
            complexityTest.testHatHashMapArrayList(i);
        }


        System.out.println("======================================================");

        System.out.println("\nTest: Hat with Array implementation");
        System.out.println("\nMethodType | Datastructure Size : Time(Nano-seconds)");

        //Test hat with Array implementation
        for (int i = 1; i < maxSize; i *= 2) {
            complexityTest.testHatArray(i);
        }


        System.out.println("======================================================");

        System.out.println("\nTest: Hat with TreeMap implementation");
        System.out.println("\nMethodType | Datastructure Size : Time(Nano-seconds)");

        //Test hat with Array implementation
        for (int i = 1; i < maxSize; i *= 2) {
            complexityTest.testHatTreeMap(i);
        }

        System.out.println("======================================================");


    }


    private void testHatHashMapArrayList(int setSize) {
        HatHashMapArrayListImpl<Integer> hatHMAL = new HatHashMapArrayListImpl<>();
        Random r = new Random();
        Timer t = new Timer();
        double elapsedTime;

        //Execute give()
        for (int i = 0; i < setSize-1; i++)
            hatHMAL.give(r.nextInt());

        t.start();
        hatHMAL.give(r.nextInt());
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("give()", setSize, elapsedTime);

        //Execute take()
        t.start();
        hatHMAL.take();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("take()", setSize, elapsedTime);

        //Execute isEmpty()
        t.start();
        hatHMAL.isEmpty();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("isEmpty()", setSize, elapsedTime);

        //Execute size()
        t.start();
        hatHMAL.size();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("size()", setSize, elapsedTime);

        System.out.println();

    }

    private void testHatArray(int setSize) {
        HatArrayImpl<Integer> hArray = new HatArrayImpl<>();
        Random r = new Random();
        Timer t = new Timer();
        double elapsedTime;

        //Execute Give()
        for (int i = 0; i < setSize-1; i++) {
            hArray.give(r.nextInt(10));
        }

        t.start();
        hArray.give(r.nextInt(10));
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("give()", hArray.size(), elapsedTime);

        //Execute Take()
        t.start();
        hArray.take();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("take()", hArray.size(), elapsedTime);

        //Execute isEmpty()
        t.start();
        hArray.isEmpty();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("isEmpty()", hArray.size(), elapsedTime);

        //Execute size()
        t.start();
        hArray.size();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("size()", hArray.size(), elapsedTime);

        System.out.println();
    }

    private void formatTimeTaken(String methodType, int setSize, double timeTaken) {
        System.out.printf("%10s | %,2d : %,.2f\n", methodType, setSize, timeTaken);
    }

    @SuppressWarnings("unused")
    private void testHashTable(int setSize) {
        HatHashTableImpl<Integer> hatTreeMap = new HatHashTableImpl<>();
        Random r = new Random();
        Timer t = new Timer();
        double elapsedTime;

        //Execute Give()
        t.start();
        for (int i = 0; i < setSize; i++) {
            hatTreeMap.give(r.nextInt());
        }
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("give()", setSize, elapsedTime);

        //Execute Take()
        t.start();
        hatTreeMap.take();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("take()", setSize, elapsedTime);

        //Execute isEmpty()
        t.start();
        hatTreeMap.isEmpty();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("isEmpty()", setSize, elapsedTime);

        //Execute size()
        t.start();
        hatTreeMap.size();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("Size()", setSize, elapsedTime);

        System.out.println();

    }

    @SuppressWarnings("unused")
    private void testHatLinkedList(int setSize) {
        HatLinkedListImpl<Integer> hatLinkedList = new HatLinkedListImpl<>();
        Random r = new Random();
        Timer t = new Timer();
        double elapsedTime;

        //Execute give()
        t.start();
        for (int i = 0; i < setSize; i++)
            hatLinkedList.give(r.nextInt());
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("give()", setSize, elapsedTime);

        //Execute take()
        t.start();
        hatLinkedList.take();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("take()", setSize, elapsedTime);

        //Execute isEmpty()
        t.start();
        hatLinkedList.isEmpty();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("isEmpty()", setSize, elapsedTime);

        //Execute size()
        t.start();
        hatLinkedList.size();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("size()", setSize, elapsedTime);

        System.out.println();

    }

    private void testHatHashMap(int setSize) {
        HatHashMapImpl<Integer> hatHashMap = new HatHashMapImpl<>();
        Random random = new Random();
        Timer t = new Timer();
        double elapsedTime;

        //Execute Give()
        for (int i = 0; i < setSize; i++) {
            hatHashMap.give(random.nextInt(10));
            if (i == random.nextInt(setSize)) {
                t.start();
            }
        }
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("give()", setSize, elapsedTime);

        //Execute Take()
        t.start();
        hatHashMap.take();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("take()", setSize, elapsedTime);

        //Execute isEmpty()
        t.start();
        hatHashMap.isEmpty();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("isEmpty()", setSize, elapsedTime);

        //Execute size()
        t.start();
        hatHashMap.size();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("size()", setSize, elapsedTime);

        System.out.println();
    }


    @SuppressWarnings("unused")
    private void testHatTreeMap(int setSize) {
        HatTreeMapImpl<Integer> hatTreeMap = new HatTreeMapImpl<>();
        Random r = new Random();
        Timer t = new Timer();
        double elapsedTime;

        //Execute Give()
        for (int i = 0; i < setSize-1; i++) {
            hatTreeMap.give(r.nextInt(10));
        }
        t.start();
        hatTreeMap.give(r.nextInt(10));
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("give()", hatTreeMap.size(), elapsedTime);

        //Execute Take()
        t.start();
        hatTreeMap.take();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("take()", hatTreeMap.size(), elapsedTime);

        //Execute isEmpty()
        t.start();
        hatTreeMap.isEmpty();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("isEmpty()", hatTreeMap.size(), elapsedTime);

        //Execute size()
        t.start();
        hatTreeMap.size();
        elapsedTime = t.getElapsedTime();
        formatTimeTaken("size()", hatTreeMap.size(), elapsedTime);

        System.out.println();

    }
}
