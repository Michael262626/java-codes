package fireDrillOne;

public class Assesment {
    public static String elements(int[] array) {
        String output ="";
        for(int value =0; value<array.length; value++)
            output += String.format("%s, ", array[value]);
        return output;
    }

}
