package fireDrillTwo;

import java.util.Arrays;

public class Task {
    public int[] doubleLengthOfTheArray(int[] array){
        return new int[array.length * 2];
    }
    public int[] doubleTheLength(int[] elements) {
        int[] array = doubleLengthOfTheArray(elements);
        for(int count = 0; count < elements. length; count++){
            array[count] = elements[count];
            array[count + elements.length] = elements[count] * 2;
        }
        return array;
    }
}