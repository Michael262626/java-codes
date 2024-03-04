import java.util.Arrays;

public class main7 {
    public static int[] sorting(int[] array) {
        for (int count = 0; count < array.length; count++) {
            for (int index = count+1; index < array.length; index++) {
                if(array[index] < array[count]) {
                    int temp = array[count];
                    array[count] = array[index];
                    array[index] = temp;

                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] number = {3, 5, 2, 9, 8};
        int[] result = sorting(number);
        System.out.print(Arrays.toString(result));
    }
}
