package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    public static int Task1(List<Integer> a, List<Integer> b) {

        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) < (a.size() - 1)) {
                sum = sum + a.get(b.get(i));
            }

        }
        return sum;

    }
}
