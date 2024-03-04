package fireDrillOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment4Test {
    @Test
    void testReverseList(){
        Assignment4 myCode = new Assignment4();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = {5, 4, 3, 2, 1};
        assertArrayEquals(result, Assignment4.elements(numbers));
    }

}