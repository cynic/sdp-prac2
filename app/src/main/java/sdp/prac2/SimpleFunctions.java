package sdp.prac2;

import java.util.List;


interface CompareFunc<T> {
    // -1 if first element is less than second element
    // 1 if first element is greater than second
    // 0 if they are eqaul
    int compare(T x, T y);
}


public class SimpleFunctions {
    public SimpleFunctions() {}

    private static int Compare(Integer x, Integer y){
        // helper function for Task 5
        // 
        if (x > y){
            return 1;
        }
        else if (x < y){
            return -1;
        }
        return 0;
    }


    public static Boolean Task5(List<Integer> list){

        for (int i = 0; i < list.size()-1; i++){
            if (Compare(list.get(i), list.get(i + 1)) >= 0 ) {
                return false;
            }
        }
        return true;
    }
   
}
