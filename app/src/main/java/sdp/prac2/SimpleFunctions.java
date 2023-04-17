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
