package hw10;

import org.junit.jupiter.api.Test;

import java.util.List;

import static hw10.Task_3.findCurrencyValues;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_3_Test {
    @Test
    public void test1() {
        String input = "Abc, $5 ghh";
        List<String> results = findCurrencyValues(input);
        assertTrue(results.contains("$5"));
    }

    @Test
    public void test2() {
        String input = "Abc, $56.89 ghh";
        List<String> results = findCurrencyValues(input);
        assertTrue(results.contains("$56.89"));
    }

    @Test
    public void test3() {
        String input = "Abc, $56.89 ghh$19";
        List<String> results = findCurrencyValues(input);
        assertTrue(results.contains("$56.89"));
        assertTrue(results.contains("$19"));
    }
}
