package FireDriilThree;

import org.junit.jupiter.api.Test;



public class TaskSixTest {

    @Test
        public void testEvenList(){
            TaskSix tasksix = new TaskSix();
            int[] numbers = {1, 2, 3, 4, 5};
            int[] EvenNumber =  TaskSix.evenNumbers(numbers);
            int expected = 6;
            assertArrayEquals(expected, EvenNumber);
        }

    private void assertArrayEquals(int expected, int[] evenNumber) {
    }


}
