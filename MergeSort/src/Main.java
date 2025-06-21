public class Main {
    public static void main(String[] args) {
        int[] array = { 10, 3, 5, 8, 6, 0, 2, 9, 7, 1, 4};

        /*
         * merge sort  = recursively divide array in 2, sort, re-combine
         * run-time complexity = O(n log n)
         * space complexity = O(n)
         */

        mergeSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length < 2 ) return;

        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        int i = 0; //left array
        int j = 0; //right array

        for (; i < mid; i++) {
            leftArray[i] = array[i];
        }
        for (; j < rightArray.length; j++) {
            rightArray[j] = array[mid + j];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static  void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        //check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }  else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}