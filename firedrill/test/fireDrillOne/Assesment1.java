package fireDrillOne;

public class Assesment1 {
    public static String elements(String[] elements){
       String output = "";
        for(int count = 0; count < elements.length; count++) {
            output += String.format("%s, ", elements[count]);
        }
        return output;
    }
}
