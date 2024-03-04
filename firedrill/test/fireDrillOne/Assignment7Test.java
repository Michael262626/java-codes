package fireDrillOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment7Test {
    @Test
    void testMergeArray() {
        Assignment7 myCode = new Assignment7();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] number1 = {6, 7, 8, 9, 10};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(result, Assignment7.merge(numbers, number1));

    }
}