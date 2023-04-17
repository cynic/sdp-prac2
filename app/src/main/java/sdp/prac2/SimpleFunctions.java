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

    public SimpleFunctions() {}
}

public List<Integer> Task6(List<Integer>a, List<Integer> b){
    int index = -1;
    for (int 1 = 0; i < a.size();i++){
        index = a.get(i);
        if (index % 100 == 0){
            b.add(index);
        }else{
            b.add(index % 100 + index);
        }
    }
    return b;
}