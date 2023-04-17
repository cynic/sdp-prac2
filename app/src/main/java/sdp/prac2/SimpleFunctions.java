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

    public static List<Integer> Task6(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            if (num % 100 == 0) {
                result.add(num);
            } else {
                int rounded = ((num / 100) + 1) * 100;
                result.add(rounded);
            }
        }
        return result;
    }
   

    public boolean Task3(String str) {
        int count = 0;
        for (int i = 0; str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false
                }
            }
        }
        return count == 0;
    }

}
