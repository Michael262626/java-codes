package FireDriilThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskFiveTest {


        @Test
        public void testEvenList(){
            TaskFive taskfive = new TaskFive();
            int[] numbers = {1, 2, 3, 4, 5};
            int[] oddNumber =  TaskFive.oddNumbers(numbers);
            int[] expected = {1, 3, 5};
            assertArrayEquals(expected, oddNumber);
        }
}
