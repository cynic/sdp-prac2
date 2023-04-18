package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public int task1(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) < a.size() && b.get(i) >= 0) {
                sum += a.get(b.get(i));
            }
        }
        return sum;
    }

    public List<String> task2(List<String> s) {
        List<String> result = new ArrayList<>();
        for (String a : s) {
            if (!a.isEmpty()) {
                result.add(a.substring(1));
            }
        }
        return result;
    }

    public static List<Integer> task6(List<Integer> numbers) {
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

    public boolean task3(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }

    public List<Integer> task4(List<Integer> list_1, List<Integer>list_2){
        List<Integer> results = new ArrayList<>();
        if(list_1.size() != list_2.size()){
            return null;
        }
        else{

            for(int i = 0; i < list_1.size(); i++){
                int addIt = list_1.get(i) * list_2.get((list_1.size()-1) - i);
                results.add(addIt);
            }

            return results;
        }
    }

    public static <T extends Comparable<T>> boolean task5(List<T> list) {
    for (int i = 1; i < list.size(); i++) {
        if (list.get(i - 1).compareTo(list.get(i)) > 0) {
            return false;
        }
    }
    return true;
}
}
