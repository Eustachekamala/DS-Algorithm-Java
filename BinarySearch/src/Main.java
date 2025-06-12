import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* Binary Search: Search algorithm that finds the position of a target value
         *                within a sorted array. Half of the array is eliminated during each step
         */
        int[] sortedNumbers = {10,20,30,40,50,60,70,80};
        int target = 60;
        int result = binarySearch(sortedNumbers, target);

        if (result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] sortedNumbers, int target) {
        int  low = 0;
        int high = sortedNumbers.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == sortedNumbers[mid]) {
                return mid;
            } else if (target < sortedNumbers[mid]) {
                high = mid - 1;
            } else if (target > sortedNumbers[mid]) {
                low = mid + 1;
            } else  {
                return mid;
            }
        }
        return -1;
    }

}