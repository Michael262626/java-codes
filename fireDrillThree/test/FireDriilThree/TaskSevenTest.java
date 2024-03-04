package FireDriilThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskSevenTest {
    @Test
    public void testEvenList(){
        TaskFive taskfive = new TaskFive();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] oddNumber =  TaskFive.oddNumbers(numbers);
        int expected = 9;
        assertArrayEquals(expected, oddNumber);
    }

    private void assertArrayEquals(int expected, int[] oddNumber) {
    }
}
