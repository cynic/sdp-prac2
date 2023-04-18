package sdp.prac2;

import java.util.*;



public class SimpleFunctions {

<<<<<<< HEAD
    public static int Task1(List<Integer> a, List<Integer> b) {
        int sum;
=======
    
    public static int Task1(List<Integer> a, List<Integer> b) {
        int sum = 0 ;
>>>>>>> 6698ba84451ca201d78a2c5dd0190d90cb0c281f
        for(int i=0; i<b.size(); i++) {      // Loop through each index i in b
            if(b.get(i) >=0 && b.get(i)<a.size()) {
                sum += a.get(b.get(i));  // Add the element at index in a to sum
            }
        }
    return sum;   

    } //Task1

        
    public static List<String> Task2(List<String> a){
        List<String> output = new ArrayList<String>();
        for(int i=0; i < a.size(); i++){
            String element = a.get(i);
            if(element.length()>1){
                output.add(element.substring(1));
            }
        }
        return output;
    }

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

    public List<Integer> Task6(List<Integer>a, List<Integer> b){
    int index = -1;
    for (int i = 0; i < a.size();i++){
        index = a.get(i);
        if (index % 100 == 0){
            b.add(index);
        }else{
            b.add(index % 100 + index);
        }
    }
    return b;
}
    public static boolean Task3(String s) {
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

