/* Koon Chua
 * EN 605.202.81
 * Lab 4
 *
 * Lab 4 Driver
 * Uses ReadWrite to open an input file, and write to an output file
 * Parse through input to create an array of integers to be sorted using shell and heap sort
 *
 */

import java.util.*;
import java.lang.*;

public class Lab4Main {
    public static void main(String[] args) {

        try{
            ReadWrite input = new ReadWrite(args[0], args[1]);
            int size = input.numLines();
            int index = 0;
            int[] orig_array = new int[size];

            // Parse input file, create array to be sorted
            while (input.hasNextInput()) {
                orig_array[index] = Integer.parseInt(input.nextInput());
                index++;
            }

            // For size 50 files: write to ourput original array
            if (orig_array.length == 50) {
                input.writeOutput("Original Array");
                for (int i = 0; i < orig_array.length; i++) {
                    input.writeOutput(orig_array[i] + " ");
                }
                input.writeOutput("\n");
            }

            // Shell Sort Increments
            // Increment 4: Hibbard's increment Sequence
            // Increment 5: Sedgewick's sequence
            int[] increment1 = {-1, 1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524};
            int[] increment2 = {-1, 1, 5, 17, 53, 149, 373, 1123, 3371, 10114, 30341 };
            int[] increment3 = {-1, 1, 10, 30, 60, 120, 360, 1080, 3240, 9720, 29160};
            int[] increment4 = {-1, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767};
            int[] increment5 = {-1, 8, 23, 77, 281, 1073, 4193, 16577, 65931};

            // Run five sorts per input file
            for (int increment = 1; increment <= 6; increment ++) {

                // Create copy to preserve order of original array
                int [] sorted_array = Arrays.copyOf(orig_array, orig_array.length);
                input.writeOutput("----------");

                int fastest;
                switch (increment) {

                    // Shell Sort: Increment 1
                    case 1:
                        RuntimeMetric shell_sort_1 = new RuntimeMetric(System.nanoTime());

                        ShellSort.shellSort(sorted_array, increment1);
                        shell_sort_1.setEndTime(System.nanoTime());
                        input.writeOutput("Shell Sort " + (increment) + " runs in " + shell_sort_1.totalTime() + " ns.\n");

                        if (sorted_array.length == 50) {
                            for (int i = 0; i < sorted_array.length; i++) {
                                input.writeOutput(sorted_array[i] + " ");
                            }
                        }
                        break;

                    // Shell Sort : Increment 2
                    case 2:
                        RuntimeMetric shell_sort_2 = new RuntimeMetric(System.nanoTime());

                        ShellSort.shellSort(sorted_array, increment2);
                        shell_sort_2.setEndTime(System.nanoTime());
                        input.writeOutput("Shell Sort " + (increment) + " runs in " + shell_sort_2.totalTime() + " ns.\n");

                        if (sorted_array.length == 50) {
                            for (int i = 0; i < sorted_array.length; i++) {
                                input.writeOutput(sorted_array[i] + " ");
                            }
                        }
                        break;

                    // Shell Sort: Increment 3
                    case 3:
                        RuntimeMetric shell_sort_3 = new RuntimeMetric(System.nanoTime());

                        ShellSort.shellSort(sorted_array, increment3);
                        shell_sort_3.setEndTime(System.nanoTime());
                        input.writeOutput("Shell Sort " + (increment) + " runs in " + shell_sort_3.totalTime() + " ns.\n");

                        if (sorted_array.length == 50) {
                            for (int i = 0; i < sorted_array.length; i++) {
                                input.writeOutput(sorted_array[i] + " ");
                            }
                        }
                        break;

                    // Shell Sort: Increment 4 (Hibbard's sequence)
                    case 4:
                        RuntimeMetric shell_sort_4 = new RuntimeMetric(System.nanoTime());

                        ShellSort.shellSort(sorted_array, increment4);
                        shell_sort_4.setEndTime(System.nanoTime());
                        input.writeOutput("Shell Sort " + (increment) + " runs in " + shell_sort_4.totalTime() + " ns.\n");

                        if (sorted_array.length == 50) {
                            for (int i = 0; i < sorted_array.length; i++) {
                                input.writeOutput(sorted_array[i] + " ");
                            }
                        }
                        break;

                    // Shell Sort: Increment 4 (Sedgewick's sequence)
                    case 5:
                        RuntimeMetric shell_sort_5 = new RuntimeMetric(System.nanoTime());

                        ShellSort.shellSort(sorted_array, increment4);
                        shell_sort_5.setEndTime(System.nanoTime());
                        input.writeOutput("Shell Sort " + (increment) + " runs in " + shell_sort_5.totalTime() + " ns.\n");

                        if (sorted_array.length == 50) {
                            for (int i = 0; i < sorted_array.length; i++) {
                                input.writeOutput(sorted_array[i] + " ");
                            }
                        }
                        break;

                    // Heap Sort
                    case 6:
                        RuntimeMetric heap_sort = new RuntimeMetric(System.nanoTime());
                        HeapSort.heapSort(sorted_array);
                        heap_sort.setEndTime(System.nanoTime());
                        input.writeOutput("Heap Sort runs in " + heap_sort.totalTime() + " ns.");

                        if (sorted_array.length == 50) {
                            for (int i = 0; i < sorted_array.length; i++) {
                                input.writeOutput(sorted_array[i] + " ");
                            }
                        }
                        break;
                }

            }
            input.closeOutput();

        } catch (Exception e) {
            System.out.println("Error: Could not enter try block, Check arguments!");
        }

        System.out.println("\nProgram complete, Check output results");
    }
}
