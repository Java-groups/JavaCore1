import static org.junit.jupiter.api.Assertions.*;

class MonthTest {
    Month monthOne = new Month();
    Month monthTwo = new Month();

    @org.junit.jupiter.api.Test
    void getAmountOfDays() {
        assertNotNull(monthOne);
        assertEquals(monthOne.getAmountOfDays(1), monthTwo.getAmountOfDays(1));
    }
}