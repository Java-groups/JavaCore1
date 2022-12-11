import static org.junit.jupiter.api.Assertions.*;

public class ArrayOfIntegerTest {
    ArrayOfInteger arrayOfInteger = new ArrayOfInteger(5);

    @org.junit.jupiter.api.Test
    void productOfAllEvenEntered() {
        arrayOfInteger.setArrayOfInteger(new int[]{1,2,3,4,5});
        assertTrue(arrayOfInteger.productOfAllEvenEntered() == 8);
    }

    @org.junit.jupiter.api.Test
    void findSecondPositivePosition() {
        arrayOfInteger.setArrayOfInteger(new int[]{1,-2,3,-4,-5});
        assertTrue(arrayOfInteger.findSecondPositivePosition() == 3 );
    }

    @org.junit.jupiter.api.Test
    void findMinAndItsPosition() {
        arrayOfInteger.setArrayOfInteger(new int[]{1,-2,3,-4,-5});
        assertArrayEquals(new int[]{-5,5}, arrayOfInteger.findMinAndItsPosition());
    }

}