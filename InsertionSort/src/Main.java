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
         *                  Adaptive = efficient for data sets that are partially sorted
         *                  Less step than bubbleSort
         *                  Best case is O(n) compared to selectionSort O(n^2)
         */

        int[] nums = {9,7,2,8,4,5,7,1,3};
        System.out.print("Before Insertion Sort: ");
        for (int num : nums){
            System.out.print(num + " ");
        }
        insertionSort(nums);
        System.out.print("\nAfter Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void insertionSort(int[] nums) {
        // start at index 1 as we assume the first element is sorted
        for (int i = 1; i < nums.length; i++){
            int temp = nums[i]; // current element to be compared
            int j = i - 1; // index of the previous element
            // shift elements to the right to make room for temp
            while (j >= 0 && nums[j] > temp){
                nums[j+1] = nums[j];
                j--;
            }
            // insert temp in the correct position
            nums[j+1] = temp;

            // For visualization of each step
            System.out.print("\nStep " + i + ": ");
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }
}