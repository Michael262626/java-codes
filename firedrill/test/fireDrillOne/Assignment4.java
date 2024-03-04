package fireDrillOne;

public class Assignment4 {
    public static int[] elements(int[] array){
        int[] element = new int[array.length];
        int index = 0;
        for(int count = array.length - 1; count >= 0; count--){
            element[count] = array[index];
            index++;
        }
        return element;
    }
}
