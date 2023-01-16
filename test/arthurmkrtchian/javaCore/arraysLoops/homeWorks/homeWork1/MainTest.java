package arthurmkrtchian.javaCore.arraysLoops.homeWorks.homeWork1;

import arthurmkrtchian.javaCore.HW04.arraysLoops.homeWorks.homeWork1.Main;

import java.io.IOException;

class MainTest {

    @org.junit.jupiter.api.Test
    void getMonth() throws IOException {
        assertTrue(Main.getMonth(7) == "July");
        assertTrue(Main.getMonth(3) == "March");
        assertTrue(Main.getMonth(1) == "January");
        assertTrue(Main.getMonth(11) == "November");
    }

    private void assertTrue(boolean b) {
    }
}