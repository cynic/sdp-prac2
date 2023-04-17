package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static int task1(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            int index = b.get(i);
            if (index >= 0 && index < a.size()) {
                sum += a.get(index);
            }
        }
        return sum;
    }

    //task 5, returning true if the list is sorted (method for sorting integers)
    public static boolean task5(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return true; // An empty list or null list is considered sorted
        }

        int prev = list.get(0); // Get the first element as the initial previous value

        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current < prev) {
                return false; // If any element is less than the previous element, the list is not sorted
            }
            prev = current;
        }

        return true; // If no elements are out of order, the list is sorted
    }
}
