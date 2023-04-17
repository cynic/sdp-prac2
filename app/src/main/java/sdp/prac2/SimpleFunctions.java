package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static int Task1(int[] a, int[] b) {
    int total = 0; // Initialize accumulator
    for (int index : b) { // Loop through each index in the array b
        if (index >= 0 && index < a.length) { // Check if the index is within range of the array a
            total += a[index]; // Add the corresponding element from a to the total
        }
    }
    return total; // Return the total sum
    }
}
