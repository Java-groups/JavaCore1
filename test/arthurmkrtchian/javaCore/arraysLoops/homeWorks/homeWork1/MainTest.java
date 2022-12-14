package arthurmkrtchian.javaCore.arraysLoops.homeWorks.homeWork1;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void getMonth() throws IOException {
        assertTrue(Main.getMonth(7) == "July");
        assertTrue(Main.getMonth(3) == "March");
        assertTrue(Main.getMonth(1) == "January");
        assertTrue(Main.getMonth(11) == "November");
    }
}