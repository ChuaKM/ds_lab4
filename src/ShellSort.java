/* Koon Chua
 * EN 605.202.81
 * Lab 4
 *
 * Shell Sort algorithm for sorting an int array.
 */

public class ShellSort {

    /**
     * Sorts an int array using Shell Sort
     * @param arr           int array to be sorted
     * @param increment     int array of increments (gaps)
     */
    public static void shellSort(int[] arr, int[] increment) {
        int index = 0;

        // Search for first increment larger than our array size
        while (index != (increment.length -1) && increment[index] < arr.length) {
            index ++;
        }

        // Starting value: two increments behind the first value
        int num = increment[index-2];

        // Begin insertion sort
        while (num > 0) {

            // Elements arr[0,...,num] already in order
            // iteratively add one element until entire array is sorted
            for (int i = num; i < arr.length; i++) {
                int j = i;

                // save arr[i] in temp, make hole at position i
                int temp = arr[i];

                // shift earlier sorted elements up until location for arr[i] is found
                while (j >= num && arr[j - num] > temp) {
                    arr[j] = arr[j - num];
                    j = j - num;
                }
                // put temp (original arr[i]) in sorted place
                arr[j] = temp;
            }
            num = increment[--index];
        }
    }
}