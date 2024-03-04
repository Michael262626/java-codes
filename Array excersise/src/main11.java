public class main11 {
    public static int[] mergeTwoSortedArray(int[] array1, int[] array2, int m, int n) {
        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (array1[i] > array2[j]) {
                result[k] = array1[i];
                i++;
            } else {
                result[k] = array2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            result[k] = array1[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = array2[i];
            j++;
            k++;
        }
        return result;
    }
    public void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        main11 msa = new main11();
        int[] array1  = {0, 1, 8 ,10};
        int[] array2  = {2, 4, 11, 15, 20};
        msa.printArray(array1);
        msa.printArray(array2);
        int[] result = mergeTwoSortedArray(array1, array2, array1.length, array2.length);
        msa.printArray(result);
    }
}
