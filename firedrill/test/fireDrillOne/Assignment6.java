package fireDrillOne;

public class Assignment6 {
    public static int[] elements(int[] array) {
        int temp = 0;
        for (int count = 0; count < array.length; count++) {
            for (int index = count + 1; index < array.length; index++)
                if (array[index] < array[count]) {
                    temp = array[count];
                    array[count] = array[index];
                    array[index] = temp;
                }
        }
        return array;
    }

    public static int[] numbers(int[] array) {
        int temp = 0;
        for (int count = 0; count < array.length; count++) {
            for (int index = count + 1; index < array.length; index++)
                if (array[index] > array[count]) {
                    temp = array[count];
                    array[count] = array[index];
                    array[index] = temp;
                }
        }
        return array;
    }

}
