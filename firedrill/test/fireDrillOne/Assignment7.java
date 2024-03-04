package fireDrillOne;

public class Assignment7 {
    public static int[] merge(int[] elements, int[] numbers) {
        int[] mergedValues = new int[elements.length + numbers.length];
        int mergedIndex = 0;
        for (int element : elements) {
            mergedValues[mergedIndex++] = element;
        }
        for (int number : numbers) {
            mergedValues[mergedIndex++] = number;
        }
        return mergedValues;
    }
}


