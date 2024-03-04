public class main4 {
    public static int elements(int[] array){
        int largest = array[0];
        for(int count = 1; count < array.length; count++){
            if(array[count] > largest){
                 largest = array[count];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] number = {2, 6, 7, 8, 5};
        int result = elements(number);
        System.out.print(result);
    }
}
