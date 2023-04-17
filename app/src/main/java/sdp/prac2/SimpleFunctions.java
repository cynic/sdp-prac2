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

                                        //task 4
/**

This method takes in two lists of integers, "a" and "b". If the two input lists are of different sizes,

the method returns null. Otherwise, it multiplies the first element of "a" with the last element of "b",

the second element of "a" with the second-last element of "b", and so on. The resulting products are stored

in a new list and returned.

@param a the first input list of integers

@param b the second input list of integers

@return a list of integers, where each element is the product of a corresponding element from list "a"

and list "b", or null if the two input lists are of different sizes
*/
    public static List<Integer> task4(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) {
            return null; // Lists must be the same size to perform the task
        }
    
        List<Integer> result = new ArrayList<>();
        int lastIndex = b.size() - 1;
    
        for (int i = 0; i < a.size(); i++) {
            int elementA = a.get(i);
            int elementB = b.get(lastIndex - i);
            result.add(elementA * elementB);
        }
    
        return result;
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
