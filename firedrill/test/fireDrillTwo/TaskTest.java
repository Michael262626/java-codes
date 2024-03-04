package fireDrillTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    private Task mytask;
    @BeforeEach
    public void initializer(){
        mytask = new Task();
    }
    @Test
    public void testToCheckTheLengthOfTheArray(){
        int[] elements = {4, 5, 8};
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, mytask.doubleLengthOfTheArray(elements));
    }
    @Test
    public void testToDoubleTheArrayLength(){
        int[] elements = {4, 5, 8};
        assertArrayEquals(new int[]{4, 5, 8, 8, 10, 16}, mytask.doubleTheLength(elements));
    }
}