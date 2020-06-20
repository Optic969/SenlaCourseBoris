import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class ArrayCounterTestNG {

    @BeforeClass
    public static void startTest(){
        System.out.println("Tests on TestNG started");
    }
    @BeforeTest
    public void displayTestName1 (){
        System.out.println("Checking the calculation of the maximum number");
    }
    @Test
    public void testMaxCount() {
        int[] arr = {12, 33, 4, 5, 77};
        int expected = 77;
        int actual = ArrayCounter.findMax(arr);
        assertEquals("Unexpected string value", expected, actual);

    }
    @BeforeTest
    public void displayTestName2 (){
        System.out.println("Checking the calculation of the minimum number");
    }

    @Test
    public void testMinCount() {
        int[] arr = {12, 33, 3, 5, 77};
        int expected = 3;
        int actual = ArrayCounter.findMin(arr);
        assertEquals("Your function is bullshit", expected, actual);

    }
}