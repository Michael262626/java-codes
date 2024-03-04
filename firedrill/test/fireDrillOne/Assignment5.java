package fireDrillOne;

public class Assignment5 {
    public static int elements(int[] array){
        int max = array[0];
        for(int count = 1; count < array.length; count++){
            if(array[count] > max){
                max = array[count];
            }
        }
        return max;
    }
}
