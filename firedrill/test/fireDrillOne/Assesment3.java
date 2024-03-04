package fireDrillOne;

public class Assesment3 {
    public static int[] elements(int[] list1, int[] list2) {
        int[] element = new int[list1.length + list2.length];
        int counter = 0;
        for (int count = 0; count < element.length; count++) {
            if (count < list1.length)
                element[count] = list1[count];
            if (count >= list1.length)
                element[count] = list2[counter++];
        }
        return element;
    }
}