//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * Insertion sort  = after comparing element to the left shift element to the
         *                  right to make room to insert a value
         *
         *                  Quadratic time O(n^2)
         *                  small data set = decent
         *                  large data set = BAD
         *
         *                  Less step than bubbleSort
         *                  Best case is O(n) compared to selectionSort O(n^2)
         */

        int[] arr = {9,7,2,8,4,5,7,1,3};

        insertionSort(arr);

        for (int i : arr){
            System.out.print(i + ", ");
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}