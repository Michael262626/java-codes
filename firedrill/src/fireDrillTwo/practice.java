package fireDrillTwo;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] myList = new double[10];

        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }
        System.out.println(Arrays.toString(myList));
    }
}
