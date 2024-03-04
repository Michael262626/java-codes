package fireDrillOne;

import java.util.Scanner;

public class Assestment2 {
    public static int elements(int array){
        int[] arrays = new int[10];
        int sum = 0;
        for(int count = 0; count < arrays.length; count++){
            sum+=count;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int result = elements(numbers);
        System.out.print(result);

    }
}
