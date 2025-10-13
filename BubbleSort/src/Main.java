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
        int[] nums = {9, 6,8,2,3,5,1,4,7};
        System.out.print("Before Bubble Sort: ");
        for(int num : nums){
            System.out.print(num + " ");
        }

        bubbleSort(nums);
        System.out.println();
        System.out.print("After Bubble Sort: ");
        for (int num : nums){
            System.out.print(num + " ");
        }
    }

    private static void bubbleSort(int[] nums) {
        int size = nums.length;
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - i - 1; j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                System.out.println();
                for (int num : nums){
                    System.out.print(num + " ");
                }
            }
        }
    }
}