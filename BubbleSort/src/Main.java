//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         * bubble sort = pairs of adjacent element are compared,
         *              and the elements swapped if they are not in order
         *
         *              Quadratic time O(n^2)
         *              Small data set = okay-ish
         *              large data set = bad
         */

        int[] arr = {9,1,4,6,8,7,5,3,2,0};
        bubbleSort(arr);
        for (int i : arr){
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}