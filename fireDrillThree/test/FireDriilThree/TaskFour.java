package FireDriilThree;

public class TaskFour {
        public  static int[] evenNumbers(int[] arr){
            int[] evenNumbers = new int[(arr.length/2)];
            int index = 0;
            for(int num = 1; num < arr.length; num+=2){
                evenNumbers[index] = arr[num];
                index++;
            }
            return evenNumbers;
        }
    }

