//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * linear search: Iterate through a collection one element at a time
         *                runtime complexity: O(n)
         *
         *                Disadvantages: Slow for large data sets
         *
         *                Advantages:
         *                      Fast for searches pf small to medium data sets
         *                      Does not need to sorted
         *                      Useful for Data structures that do not have random access (Linked List)
         */

        int [] array = {1,3,5,7,9,11,13,15,17,19};
        int target = 13;
        int result = linearSearch(array, target);
        if (result != -1){
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in array");
        }
    }

    private static int linearSearch(int[] array, int target) {
        for(int i = 0; i < array.length; i++){
            if (array[i] == target){
                return i;
            } else {
                continue;
            }
        }
        return - 1;
    }

}