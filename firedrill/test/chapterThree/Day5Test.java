package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day5Test {
    @Test
    void testTOReturnO(){
        Day5 myCode = new Day5();
        int[] numbers = new int[10];
        int[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(result, myCode.elements(numbers));
    }

}