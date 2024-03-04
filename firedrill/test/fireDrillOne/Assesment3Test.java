package fireDrillOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assesment3Test {
    @Test
    void testThatItCanConcatenateTwoList(){
        Assesment3 myCode = new Assesment3();
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {6, 7, 8, 9, 10};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(result, Assesment3.elements(list1, list2));
    }
}