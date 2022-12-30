package arthurmkrtchian.javaCore.arraysLoops.homeWorks.homeWork2;

import arthurmkrtchian.javaCore.HW4.arraysLoops.homeWorks.homeWork2.Main;
import arthurmkrtchian.javaCore.HW4.arraysLoops.homeWorks.homeWork2.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void calculate() {
           int[] array = {12, 46, -91, 1, -13, 78, 203, 67, 8, 10};
           Result result = new Result(84870240, Result.Type.PRODUCT);
           assertTrue(Main.calculate(array).equals(result));
    }
}