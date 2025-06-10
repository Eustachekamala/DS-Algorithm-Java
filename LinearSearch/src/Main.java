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

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int index = linearSearch(array);

        if (index != -1){
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[]array){
        for (int i = 0; i < array.length; i++){
            if (array[i] == 4){
                return i;
            }
        }
        return -1;
    }

}