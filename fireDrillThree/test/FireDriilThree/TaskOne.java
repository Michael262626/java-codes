package FireDriilThree;

import java.util.Arrays;

public class TaskOne {
    public static int[] taskOne(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10) {
        int[] array = new int[10];
        array[0] = num1;
        array[1] = num2;
        array[2] = num3;
        array[3] = num4;
        array[4] = num5;
        array[5] = num6;
        array[6] = num7;
        array[7] = num8;
        array[8] = num9;
        array[9] = num10;

        return array;
    }

    public static String taskTwo(int[] num) {
        StringBuilder array = new StringBuilder();
        for (int count : num) {
            array.append(count).append("\n");
            System.out.println(count);
        }

        return array.toString();
    }
    public static int[] taskThree(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10) {
       int [] array = new int[10];

       array[0] = num1;
       array[1] = num2;
       array[2] = num3;
       array[3] = num4;
       array[4] = num5;
       array[5] = num6;
       array[6] = num7;
       array[7] = num8;
       array[8] = num9;
       array[9] = num10;

        System.out.print(Arrays.toString(array));
        return array;
    }

    public static int[] taskFour(int[] number) {
        int[] array = new int[(number.length/2)];
        int index = 0;
        for(int count = 0; count > number.length; count+=2){
            array[index] =
    }

}



