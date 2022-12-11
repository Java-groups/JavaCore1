package HW4.com;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class HW4Test {
    HW4 hw4 = new HW4();
    @Test
    public void secondTask() {
        int[] array = {1,2,3,4,5,6,7,8,9,7};
        assertTrue(hw4.secondTask(array) == 15);
    }
}