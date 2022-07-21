package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
<<<<<<< HEAD
    public static int Task1(List<Integer> a, List<Integer> b) {

        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) < (a.size() - 1)) {
                sum = sum + a.get(b.get(i));
            }

        }
        return sum;

    }
=======

    public static List<Integer> Task4(List<Integer> a, List<Integer> b)
    {
        List<Integer> c =new ArrayList<Integer>();  

        if(a.size() == b.size())
        {
            int listLength = a.size();
            int halfListSize = 0;
            
            for(int i=0; i < listLength; i++)
            {
                c.add(a.get(i) + b.get(listLength - 1 - i));
            }
            return c;
        }
        
        return null;
    }

>>>>>>> origin/g19h4806
}
