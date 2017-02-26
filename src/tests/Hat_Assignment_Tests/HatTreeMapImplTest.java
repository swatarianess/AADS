package tests.Hat_Assignment_Tests;

import Hat_Assignment.Implementations.HatTreeMapImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.SecureRandom;


/**
 * Created by Stephen A.
 */
public class HatTreeMapImplTest {

    private HatTreeMapImpl<Integer> hatTreeMap = null;

    @Before
    public void setUp() throws Exception {
        hatTreeMap = new HatTreeMapImpl<>();
    }

    @Test
    public void giveTest() {
        hatTreeMap.give(5);
    }

    @Test
    public void takeTest() throws Exception {

    }

}