package tests.Hat_Assignment_Tests;

import Hat_Assignment.Implementations.HatLinkedListImpl;
import org.junit.Before;
import org.junit.Test;

import java.security.SecureRandom;


/**
 * Created by Stephen A.
 */
public class HatLinkedListImplTest {

    private HatLinkedListImpl<Integer> hatLinkedList = null;
    private SecureRandom r = new SecureRandom();

    @Before
    public void setUp() throws Exception {
            hatLinkedList = new HatLinkedListImpl<>();
    }

    @Test
    public void give() throws Exception {
        for (int i = 1; i <= 2; i*=2) {
            setPopulationSize(i);
        }
        System.out.println(hatLinkedList);
    }

    @Test
    public void giveRatioTest() throws Exception{

    }

    @Test
    public void take() throws Exception {

    }


    private void setPopulationSize(int populationSize){
        for (int i = 0; i < populationSize; i++) {
            hatLinkedList.give(r.nextInt(100));
        }
    }
}