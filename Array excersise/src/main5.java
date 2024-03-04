public class main5 {
    public static int elements(int[] array){
        int max1 = array[0];
        int max2 = array[1];
        for(int count = 1; count < array.length; count++){
            if(array[count] > max1){
                max1 = array[count];
            }
            else if(max1 > max2){
                max2 = max1;
            }
        }return max2;
    }

    public static void main(String[] args) {
        int[] number = {3, 6, 7, 3, 5, 8};
        int result = elements(number);
        System.out.print(result);
    }
}
