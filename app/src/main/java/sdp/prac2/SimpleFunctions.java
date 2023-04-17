package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
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
    public static boolean task3(String s) {
        int count = 0; 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;    //increment counter for an opening parentheses
            } else if (c == ')') {
                count--;    // decrement counter for a matching closing parentheses 
                if (count < 0) {
                    return false;   // extra closing parentheses
                }
            }
        }
        return count == 0;
    }
    public SimpleFunctions() {}
}
