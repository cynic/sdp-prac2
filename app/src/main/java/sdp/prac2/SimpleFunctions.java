package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

    public static List<Integer> Task1(List<Integer> a, List<Integer> b) {
        int sum;
        for(int i=0; i<b.size(); i++) {      // Loop through each index i in b
            if(b.get(i) >=0 && b.get(i)<a.size()) {
                sum += a.get(b.get(i));  // Add the element at index in a to sum
            }
        }
    return sum;   

    } //Task1

    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
    if (a.size() != b.size()) {
        return null;
    }
    List<Integer> result = new ArrayList<Integer>();
    int size = a.size();
    for (int i = 0; i < size; i++) {
        result.add(a.get(i) * b.get(size - i - 1));
    }
    return result;
}

    public SimpleFunctions() {}
}
