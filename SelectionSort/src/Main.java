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

        int[] nums = {9,2,4,8,5,7,3,6,1};
        System.out.print("Before Sort: ");
        for (int num : nums){
            System.out.print(num + " ");
        }

        // We call the selection sort method here
        selectionSort(nums);
        System.out.println();
        System.out.print("After Sort: ");
        // We print the sorted array here
        for (int num : nums){
            System.out.print(num + " ");
        }
    }

    private static void selectionSort(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num : nums){
                System.out.print(num + " ");
            }
        }
    }
}