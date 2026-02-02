package practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
	
	
	public static List<Integer> twoSumBruteForce(int target, int n, List<Integer> arr) {
	    // Write your code here

		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {
				if(arr.get(i)+arr.get(j)==target) {
					return Arrays.asList(i+1,j+1);
				}
					
			}
			
		}
		return Arrays.asList();
		
		
	    }
	
	public static List<Integer> twoSumSorting(int target, int n, List<Integer> arr) {
	    // Write your code here
Collections.sort(arr);
		for(int i=0,j=n-1;i<j;) {
			if((arr.get(i)+arr.get(j))>target)
					j--;
			else if((arr.get(i)+arr.get(j))<target)
				i++;
			else
				return Arrays.asList(i+1,j+1);
					
		}
		return Arrays.asList();
		
	    }
	
	public static List<Integer> twoSumHashMap(int target, int n, List<Integer> arr) {
	   Map<Integer,Integer>twoSum=new HashMap<>();
	   for(int i=0;i<n;i++) {
		   int complement=target-arr.get(i);
		   if(twoSum.containsKey(complement)) {
			   return Arrays.asList(twoSum.get(complement)+1,i+1);
		   }
		   twoSum.put(arr.get(i), i);
	   }
		return Arrays.asList();
	    }
	
	public static void main(String args[]) {
		System.out.println(twoSumBruteForce(9,4,Arrays.asList(2,7,11,15)));
		//System.out.println(twoSumHashMap(6,3,Arrays.asList(2,3,4)));
		
	}

}