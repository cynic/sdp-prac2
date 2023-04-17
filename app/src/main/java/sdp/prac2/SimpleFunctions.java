package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

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
   
}
