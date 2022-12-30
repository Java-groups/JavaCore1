package arthurmkrtchian.javaCore.arraysLoops.homeWorks.homeWork3;

import arthurmkrtchian.javaCore.HW4.arraysLoops.homeWorks.homeWork3.ArrayElement;
import arthurmkrtchian.javaCore.HW4.arraysLoops.homeWorks.homeWork3.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    static int[] array = {54, -2, -24, 7, 11};
    static int[] array2 = {54, -71, -24, 7, 11};

    @Test
    void getSecondPositive() {
        ArrayElement result = new ArrayElement(7,3);
        assertTrue(result.equals(Main.getSecondPositive(array)));
    }

    @Test
    void getMinimum() {
        ArrayElement result = new ArrayElement(-71,1);
        assertTrue(result.equals(Main.getMinimum(array2)));
    }

    @Test
    void getEvensProduct() {
        int result = 2592;
        assertTrue(Main.getEvensProduct(array) == result);
    }
}