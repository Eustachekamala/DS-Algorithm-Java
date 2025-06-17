//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * Selection sort = search through an array and keep track of the minimum value
         *                  during each iteration. At the end of each iteration, we swap variables
         *
         *                  Quadratic time O(n^2)
         *                  small data set = okay
         *                  large data set = BAD
         */

        int[] arr = {9,2,4,8,5,7,3,6,1};
        selectionSort(arr);

        for (int i : arr){
            System.out.print(i);
        }

    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}