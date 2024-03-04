package chapterThree;

public class Day4 {
    public boolean[] elements(int[] array){
        boolean[] arrays = new boolean[array.length];
        for(int count = 0; count < array.length; count++){
            arrays[count] = array[count] % 2 == 1;
        }
        return arrays;
    }
}
