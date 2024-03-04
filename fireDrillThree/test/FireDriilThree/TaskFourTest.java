package FireDriilThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskFourTest {

        @Test
        public void testEvenList(){
            TaskFour taskfour = new TaskFour();
            int[] numbers = {1, 2, 3, 4, 5};
            int[] EvenNumber =  TaskFour.evenNumbers(numbers);
            int[] expected = {2, 4};
            assertArrayEquals(expected, EvenNumber);
        }

}
