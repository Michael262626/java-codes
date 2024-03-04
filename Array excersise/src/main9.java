public class main9 {
    public static double elements(int[] array) {
        double sum = 0;
        for (int count : array) {
            sum += count;
        }

        return sum/ array.length;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6, 7, 3};
        double result = elements(numbers);
        System.out.print(result);
    }

}
