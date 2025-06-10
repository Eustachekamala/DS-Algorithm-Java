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
        int left = 0;
        int right = sortedNumbers.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (sortedNumbers[middle] == target) {
                return middle; // Target found
            } else if (sortedNumbers[middle] < target) {
                left = middle + 1; // search right half
            } else {
                right = middle - 1; // search left half
            }
        }
        return -1;
    }

}