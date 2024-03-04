package chapterThree;

public class Day3 {
    public static int[] elements(int[] array){
        for(int count = 0; count < array.length; count++){
           array[count] = array[count] % 2;
        }
        return array;
    }
}
