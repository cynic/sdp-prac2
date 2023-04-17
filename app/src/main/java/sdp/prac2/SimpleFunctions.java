package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public int Task1(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for ( int i = 0; i < b.size(); i++ ) {
            if (b.get(i) < a.size() - 1 && b.get(i) >= 0) {
                sum += a.get( (b.get(i)) );
            }
            else {
                continue; 
            }
        }
        return sum;
    }

    public List<String> Task2(List<String> s) {
        List<String> result = new ArrayList<String>();
        for (String a : s) {
            if (a.length() > 0) {
                result.add(a.substring(1, a.length()));
            }
            else {
                continue;
            }
        }
        return result;
    }
}
