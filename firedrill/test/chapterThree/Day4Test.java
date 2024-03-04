package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day4Test {
    @Test
    void testValueToReturnABooleanValue(){
        Day4 myCode = new Day4();
        int[] numbers= {4, 5, 8, 8, 8, 2, 9};
        boolean[] result = {false, true, false, false, false, false, true};
        assertArrayEquals(result, myCode.elements(numbers));
    }

}