import java.util.Arrays;

public class main8 {
    public static int[] elements(int[] array) {
        int[] frequency = new int[10];
        for (int i : array) {
            frequency[i]++;
        }
      return frequency;
    }
    public static void main(String[] args) {
        int[] numbers = {4, 6 , 4 , 3 , 5, 9, 5, 6, 7};
        int[] result = elements(numbers);
        System.out.print(Arrays.toString(result));
    }
}
