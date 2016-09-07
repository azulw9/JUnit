package ua.epam;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Created by supervisor on 06.09.2016.
 */
public class operationsArrayTest {
    private static operationsArray a;
    private static int size = 10;
    @BeforeClass
    public static void run()
    {
        a = new operationsArray();
    }

    @Test
    public void testInvertArraySize(){
        int[] test_arr = a.createArray(size);
        int[] inv_arr = a.invertArray(test_arr);
        Assert.assertEquals(test_arr.length, inv_arr.length);
    }

    @Test
    public void testCorrectInversionEvenSize(){
        int[] test_arr = a.createArray(size);
        int[] inv_arr = a.invertArray(test_arr);
        int[] inv2_arr = a.invertArray(inv_arr);
        Assert.assertArrayEquals(test_arr, inv2_arr);
    }

    @Test
    public void testCorrectInversionOddSize(){
        int[] test_arr = a.createArray(size+1);
        int[] inv_arr = a.invertArray(test_arr);
        int[] inv2_arr = a.invertArray(inv_arr);
        Assert.assertArrayEquals(test_arr, inv2_arr);
    }

    @Test
    public void testCreateArray(){
        int[] arr1 = a.createArray(size);
        Assert.assertEquals(size, arr1.length);
        Assert.assertNotNull(arr1);
    }

    @Test (expected = NegativeArraySizeException.class)
    public void testNegativeArraySizeException(){

        int[] arr3 = a.createArray(-1);

    }

}
