package fireDrillOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment5Test {
    @Test
    void testLargestNumber(){
        Assignment5 myCode = new Assignment5();
        int[] numbers = {1, 4, 3, 6};
        int result = 6;
        assertEquals(result, Assignment5.elements(numbers));
    }

}