import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ArrayCounterTestsJunit {

    @Rule
    public final TestRule globalTimeout = Timeout.seconds(10);

    @BeforeClass
    public static void startTest(){
        System.out.println("Tests on JUnit started");
    }

    @Test
    @DisplayName("Checking the calculation of the maximum number")
    public void testMaxCount() {
        int[] arr = {12, 33, 4, 5, 77};
        int expected = 77;
        int actual = ArrayCounter.findMax(arr);
        assertEquals("Unexpected string value", expected, actual);

    }

    @Test
    @DisplayName("Checking the calculation of the minimum number")
    public void testMinCount() {
        int[] arr = {12, 33, 3, 5, 77};
        int expected = 3;
        int actual = ArrayCounter.findMin(arr);
        assertEquals("Your function is bullshit", expected, actual);

    }
}

