package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public static boolean Task5 (List<Integer>lst){ //assuming the list is of integers
		boolean descendingOrder = true; //boolean flag
		for (int i=0; i<lst.size()-1; i++){ //check descending order
			if (lst.get(i)<lst.get(i+1)){
				descendingOrder = false;
			}
		}
		boolean ascendingOrder = true;
		for (int i=0; i<lst.size()-1; i++){ //check descending order
			if (lst.get(i)>lst.get(i+1)){
				ascendingOrder = false;
			}
		}
		if (ascendingOrder == true || descendingOrder == true){ //if either ascending or descending order is true then return true
			return true;
		}
		else{
			return false;
		}
    }//Task5 method for sorting a list of integers
    public SimpleFunctions() {}
}
