package Hat_Assignment;

import Hat_Assignment.Implementations.HatHashMapArrayListImpl;
import Hat_Assignment.Implementations.HatHashTableImpl;
import Hat_Assignment.Implementations.HatLinkedListImpl;
import Hat_Assignment.Implementations.HatTreeMapImpl;
import Hat_Assignment.util.Timer;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.security.SecureRandom;
import java.util.ArrayList;


/**
 * Created by Stephen A.
 */
public class ComplexityTest {

    private JsonObject[] linkedListObject = new JsonObject[]{};
    private JsonObject[] hashMapObject = new JsonObject[]{};
    private JsonObject[] treeMapMapObject = new JsonObject[]{};
    private JsonObject[] hashTableObject = new JsonObject[]{};

    //1
    private ArrayList<Double> giveCalc1 = new ArrayList<>();
    private ArrayList<Double> takeCalc1 = new ArrayList<>();
    private ArrayList<Double> isEmptyCalc1 = new ArrayList<>();
    private ArrayList<Double> sizeCalc1 = new ArrayList<>();

    //2
    private ArrayList<Double> giveCalc2 = new ArrayList<>();
    private ArrayList<Double> takeCalc2 = new ArrayList<>();
    private ArrayList<Double> isEmptyCalc2 = new ArrayList<>();
    private ArrayList<Double> sizeCalc2 = new ArrayList<>();

    //3
    private ArrayList<Double> giveCalc3 = new ArrayList<>();
    private ArrayList<Double> takeCalc3 = new ArrayList<>();
    private ArrayList<Double> isEmptyCalc3 = new ArrayList<>();
    private ArrayList<Double> sizeCalc3 = new ArrayList<>();


    public static void main(String[] args){
        ComplexityTest complexityTest = new ComplexityTest();
        int maxSize = 3500000; //2,097,152

        System.out.println("\nTest: Hat with LinkedList implementation");

        //Test Hat with LinkedList Implementation
        for(int i = 1; i <= maxSize; i*=2) {
            complexityTest.testHatLinkedlist(i);
        }

        System.out.println("======================================================");
/*
        System.out.println("\nTest: Hat with HashMap-ArrayList combination implementation");

        //Test hat with HashMap_ArrayList implementation
        for(int i=1; i <= maxSize; i*=2) {
            complexityTest.testHatHashMapArrayList(i);
        }
*/

        System.out.println("======================================================");

        System.out.println("\nTest: Hat with Tree-map combination implementation");

        //Test hat with Tree_Map implementation
        for (int i = 1; i < maxSize; i*=2) {
            complexityTest.testHatTreeMap(i);
        }


        System.out.println("======================================================");

        System.out.println("\nTest: Hat with HashTable combination implementation");

        //Test hat with HashTable implementation
        for (int i = 1; i < maxSize; i*=2) {
            complexityTest.testHashTable(i);
        }

        System.out.println("======================================================");


    }

    private void testHatLinkedlist(int setSize){
        HatLinkedListImpl<Integer> hatLinkedList = new HatLinkedListImpl<>();
        SecureRandom r = new SecureRandom();
        Timer t = new Timer();

        JsonObject giveMethodTime = new JsonObject();
        JsonObject takeMethodTime = new JsonObject();
        JsonObject isEmptyMethodTime = new JsonObject();
        JsonObject sizeMethodTime = new JsonObject();
        double elapsedTime;

//        System.out.println("Give() | Take() | isEmpty() | size()");

        //Execute give()
        t.start();
        for(int i = 0; i < setSize; i++)
            hatLinkedList.give(r.nextInt());
        elapsedTime = t.getElapsedTime();
        giveMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("give()", setSize,elapsedTime);

        //Execute take()
        t.start();
        hatLinkedList.take();
        elapsedTime = t.getElapsedTime();
        takeMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("take()", setSize,elapsedTime);

        //Execute isEmpty()
        t.start();
        hatLinkedList.isEmpty();
        elapsedTime = t.getElapsedTime();
        isEmptyMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("isEmpty()", setSize,elapsedTime);

        //Execute size()
        t.start();
        hatLinkedList.size();
        elapsedTime = t.getElapsedTime();
        sizeMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("size()", setSize,elapsedTime);

        System.out.println();

    }

    private void testHatHashMapArrayList(int setSize){
        HatHashMapArrayListImpl<Integer> hatHashMapArrayList = new HatHashMapArrayListImpl<>();
        SecureRandom r = new SecureRandom();
        Timer t = new Timer();
        JsonObject giveMethodTime = new JsonObject();
        JsonObject takeMethodTime = new JsonObject();
        JsonObject isEmptyMethodTime = new JsonObject();
        JsonObject sizeMethodTime = new JsonObject();
        double elapsedTime;

        //Execute give()
        t.start();
        for (int i = 0; i < setSize; i++)
            hatHashMapArrayList.give(r.nextInt());
        elapsedTime = t.getElapsedTime();
        giveMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("give()", setSize, elapsedTime);

        //Execute take()
        t.start();
        hatHashMapArrayList.take();
        elapsedTime = t.getElapsedTime();
        takeMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("take()", setSize, elapsedTime);

        //Execute isEmpty()
        t.start();
        hatHashMapArrayList.isEmpty();
        elapsedTime = t.getElapsedTime();
        isEmptyMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("isEmpty()", setSize,elapsedTime);

        //Execute size()
        t.start();
        hatHashMapArrayList.size();
        elapsedTime = t.getElapsedTime();
        sizeMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("size()", setSize,elapsedTime);

        System.out.println();

    }

    private void testHatTreeMap(int setSize){
        HatTreeMapImpl<Integer> hatTreeMap = new HatTreeMapImpl<>();
        SecureRandom r = new SecureRandom();
        Timer t = new Timer();
        JsonObject giveMethodTime = new JsonObject();
        JsonObject takeMethodTime = new JsonObject();
        JsonObject isEmptyMethodTime = new JsonObject();
        JsonObject sizeMethodTime = new JsonObject();
        double elapsedTime;

        //Execute Give()
        t.start();
        for (int i = 0; i < setSize; i++) {
            hatTreeMap.give(r.nextInt());
        }
        elapsedTime = t.getElapsedTime();
        giveMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("give()", setSize,elapsedTime);

        //Execute Take()
        t.start();
        hatTreeMap.take();
        elapsedTime = t.getElapsedTime();
        takeMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("take()", setSize, elapsedTime);

        //Execute isEmpty()
        t.start();
        hatTreeMap.isEmpty();
        elapsedTime = t.getElapsedTime();
        isEmptyMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("isEmpty()", setSize, elapsedTime);

        //Execute size()
        t.start();
        hatTreeMap.size();
        elapsedTime = t.getElapsedTime();
        sizeMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("size()", setSize, elapsedTime);

        System.out.println();

    }

    private void testHashTable(int setSize){
        HatHashTableImpl<Integer> hatTreeMap = new HatHashTableImpl<>();
        SecureRandom r = new SecureRandom();
        Timer t = new Timer();
        JsonObject giveMethodTime = new JsonObject();
        JsonObject takeMethodTime = new JsonObject();
        JsonObject isEmptyMethodTime = new JsonObject();
        JsonObject sizeMethodTime = new JsonObject();
        double elapsedTime;

        //Execute Give()
        t.start();
        for (int i = 0; i < setSize; i++) {
            hatTreeMap.give(r.nextInt());
        }
        elapsedTime = t.getElapsedTime();
        giveMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("give()", setSize, elapsedTime);

        //Execute Take()
        t.start();
        hatTreeMap.take();
        elapsedTime = t.getElapsedTime();
        takeMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("take()", setSize, elapsedTime);

        //Execute isEmpty()
        t.start();
        hatTreeMap.isEmpty();
        elapsedTime = t.getElapsedTime();
        isEmptyMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("isEmpty()", setSize, elapsedTime);

        //Execute size()
        t.start();
        hatTreeMap.size();
        elapsedTime = t.getElapsedTime();
        sizeMethodTime.addProperty(String.valueOf(setSize), elapsedTime);
        formatTimeTaken("Size()", setSize, elapsedTime);

        System.out.println();

    }

    private void formatTimeTaken(String methodType, int setSize, double timeTaken){
        System.out.println(String.format("%10s | %s : %5s",methodType, setSize, timeTaken));

       /* switch (x){
            case 0:
                if(methodType=="give()"){
                    giveCalc1.add(setSize,timeTaken);
                }
                if(methodType=="take()"){
                    takeCalc1.add(setSize,timeTaken);

                }

                if (methodType=="isEmpty()"){
                    isEmptyCalc1.add(setSize,timeTaken);

                }
                if (methodType=="size()"){
                    sizeCalc1.add(setSize,timeTaken);
                }

                break;

            case 1:
                if(methodType=="give()"){
                    giveCalc2.add(setSize,timeTaken);
                }
                if(methodType=="take()"){
                    takeCalc2.add(setSize,timeTaken);

                }

                if (methodType=="isEmpty()"){
                    isEmptyCalc2.add(setSize,timeTaken);

                }
                if (methodType=="size()"){
                    sizeCalc2.add(setSize,timeTaken);
                }

                break;

            case 2:
                if(methodType=="give()"){
                    giveCalc3.add(setSize,timeTaken);
                }
                if(methodType=="take()"){
                    takeCalc3.add(setSize,timeTaken);

                }

                if (methodType=="isEmpty()"){
                    isEmptyCalc3.add(setSize,timeTaken);

                }
                if (methodType=="size()"){
                    sizeCalc3.add(setSize,timeTaken);
                }

                break;

        }*/
    }

    private int calculateO(ArrayList<Double> anArray){
        int result = 0;

       return result;
    }



}
