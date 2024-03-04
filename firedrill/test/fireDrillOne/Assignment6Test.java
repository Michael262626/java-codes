package fireDrillOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment6Test {
    @Test
    void testSortingMethods(){
        Assignment6 myCode = new Assignment6();
        int[] numbers = {1, 3, 4 ,5, 2};
        int[] result = {1, 2, 3, 4, 5};
        assertArrayEquals(result, Assignment6.elements(numbers));
    }
}