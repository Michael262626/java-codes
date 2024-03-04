package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day3Test {
    @Test
    void testEvenAndOddNumbersReturnsOneAndZero(){
        Day3 myCode = new Day3();
        int[] numbers = {4, 5, 8, 8, 8, 2, 9};
        int[] result = {0, 1, 0, 0, 0, 0, 1};
        assertArrayEquals(result, Day3.elements(numbers));
    }

}