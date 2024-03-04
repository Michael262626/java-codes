package test;

import java.util.ArrayList;
import java.util.Scanner;

public class firedrill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int number;
        String result = "";
        System.out.println("Enter numbers between 1-15");
        number = scanner.nextInt();
        while (number != 22) {
            numbers.add(number);
            System.out.println("Enter numbers between 1-15");
            number = scanner.nextInt();
        }
        for(int count = 0; count < numbers.size(); count++) {
            result ="";
            for(int index=0;index<numbers.get(count);index++) {
                result += "*";
            }
            System.out.println(result);
        }


    }

}
