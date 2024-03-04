import java.util.Arrays;

public class main6 {
    public static int[] reverse(int[] array){
        int[] newArray = new int[array.length];
        int index = 0;
        for(int count = array.length - 1; count >= 0; count--){
            newArray[count] = array[index];
            index++;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = reverse(numbers);
        System.out.print(Arrays.toString(result));
    }
}
