/* Koon Chua
 * EN 605.202.81
 * Lab 4
 *
 * Heap Sort algorithm for sorting an int array.
 * Modified Version, From https://www.geeksforgeeks.org/shellsort/
 */

public class HeapSort {

    /**
     * Sorts an int array using heap sort
     * @param arr   int array to be sorted
     */
    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    /**
     * Heapify sub tree
     * @param arr   int array to be sorted
     * @param n     size of heap
     * @param i     rooted node, index in arr[]
     */
    public static void heapify(int arr[], int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;  // left = 2*i + 1
        int right = 2 * i + 2;  // right = 2*i + 2

        // left child > root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // right child > largest
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // largest not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursive step, build heap top down
            heapify(arr, n, largest);
        }
    }
}