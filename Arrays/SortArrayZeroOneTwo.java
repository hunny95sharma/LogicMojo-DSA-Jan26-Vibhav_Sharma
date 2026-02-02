package practise;

import java.util.Arrays;
import java.util.List;

public class SortArrayZeroOneTwo {
	
	
	public static List<Integer> SortArrayZeroOneTwoBetterApproach(int n, List<Integer> arr) {
	    int countOne=0;
	    int countZero=0;
	    for(int i=0;i<n;i++) {
	    	if(arr.get(i)==1)
	    		countOne++;
	    	
	    	if(arr.get(i)==0)
	    		countZero++;
	    }
	    for(int i=0;i<countZero;i++)
	    	arr.set(i, 0);
	    for(int i=countZero;i<countOne+countZero;i++)
	    	arr.set(i, 1);
	    for(int i=countOne+countZero;i<n;i++)
	    	arr.set(i, 2);
	    return arr;
	    }
	
	public static List<Integer> SortArrayZeroOneTwoDutchNationalFlagApproach(int n, List<Integer> arr) {
		
	    for(int i=0,j=0,k=n-1;i<=k;) {
	    	int temp=0;
	    	if(arr.get(i)==0) {
	    		temp=arr.get(i);
	    		arr.set(i,arr.get(j) );
	    		arr.set(j, temp);
	    		i++;
	    		j++;
	    	}
	    	else if(arr.get(i)==1) {
	    		i++;
	    	}
	    	else{
	    		temp=arr.get(i);
	    		arr.set(i,arr.get(k) );
	    		arr.set(k, temp);
	    		k--;
	    	}
	    }
	    return arr;
	    }
	
	
	public static void main(String args[]) {
	 System.out.println(SortArrayZeroOneTwoDutchNationalFlagApproach(6,Arrays.asList(0, 1 ,2 ,1, 2,0)));	
	}
}