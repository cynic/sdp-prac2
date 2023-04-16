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
}
