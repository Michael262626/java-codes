import java.util.Arrays;

public class main10 {
    public static int[] elements(int[] array){
        int[] myArray = new int[array.length];
        int index = 0;
        for(int count = array.length - 1; count >= 0; count--){
            myArray[count] = array[index];
            index++;
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] number = {3, 5, 6, 3, 5, 6};
        int[] result = elements(number);
        System.out.print(Arrays.toString(result));
    }
}
