package FireDriilThree;

public class TaskFive {
    public  static int[] oddNumbers(int[] arr){
        int[] oddNumbers = new int[(arr.length)];
        int index = 0;
        for(int num = 1; num < arr.length; num+=2){
            oddNumbers[index] = arr[num];
            index++;
        }
        return oddNumbers;
    }
}
