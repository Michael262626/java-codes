import java.util.Arrays;

public class main3 {
    public static int elements(int[] array) {
        int sum = 0;
        for (int count = 1; count < array.length; count++) {
            sum += array[count];
        }return sum;
    }


    public static void main(String[] args) {
        int[] number = {3, 4, 5, 6};
        int result = elements(number);
        System.out.print(result);
    }
}