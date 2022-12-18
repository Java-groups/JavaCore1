package hw4;

import org.junit.jupiter.api.Test;

import static hw4.Task_1.getDaysInMonth;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task_1_test {
    @Test
    public void shouldBe31DaysInJanuary(){
        int days = getDaysInMonth(1);
        assertEquals(31, days);
    }

    @Test
    public void shouldBe31DaysInFebruary(){
        int days = getDaysInMonth(2);
        assertEquals(28, days);
    }

    @Test
    public void shouldBeErrorWhenWrongNumbers(){
        int days = getDaysInMonth(99);
        assertEquals(0, days);
    }
}
