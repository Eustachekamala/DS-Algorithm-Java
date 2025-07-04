//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         *   QuickSort = moves smaller element to left of pivot.
         *              recursively divide array in 2 partitions
         */
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort(arr, 0, n-1);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    //Method to perform QuickSort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            //Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    //Method to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; //pivot;
        int i = low - 1; //Index of smaller element

        for (int j = low; j < high; j++) {
            //If Current element is less than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1; // return pivot index
    }
}