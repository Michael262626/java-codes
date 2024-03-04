package FireDriilThree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaskOneTest {
    @Test
    void taskOneTest(){
        int[] collector =  TaskOne.taskOne(0,0,0,0,0,0,0,0,0,0);
        int[] expected =  {0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(expected, collector);

    }
    @Test
    void taskTwoTest(){
        int[] num = {0,0,0,0,0,0,0,0,0,0,0,0};
        String collector = TaskOne.taskTwo(num);
        String output = """
                0
                0
                0
                0
                0
                0
                0
                0
                0
                0
                0
                0
                """;



        assertEquals(output, collector);


    }
    @Test
    void taskThree(){

        int[] result = TaskOne.taskThree(0,0,0,0,0,0,0,0,0,0);
        int[] output = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(output, result);


    }
    @Test
    void taskFour(){
        int[] number = {1,2,4,5,6,3,2,4};
        int[] result =  TaskOne.taskOne(number);

    }




}
