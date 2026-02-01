package practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MajorityElementBoyerVotingAlgo {

	static int MajorityElementBoyerVotingAlgoBruteForce(int n, List<Integer> arr ) {

	    if (n == 0) return -1;
	    if (n == 1) return arr.get(0);

	    for (int i = 0; i < n; i++) {
	        int count = 0;
	        Integer candidate = arr.get(i);

	        for (int j = 0; j < n; j++) {
	            if (candidate.equals(arr.get(j))) {
	                count++;
	            }
	        }

	        if (count > n / 2) {
	            return candidate;
	        }
	    }

	    return -1;

	}
	
	static int MajorityElementBoyerVotingAlgoSortingApproach(int n,List<Integer>arr) {
		if(arr.size()==1)
			return arr.get(0);
		Collections.sort(arr);
		int count=1;
		int majorityElement=arr.get(0);
		
		for(int i=1;i<n;i++) {
			if(arr.get(i)==majorityElement) {
				count++;
			}else {
				if(count>n/2)
					return majorityElement;
				majorityElement=arr.get(i);
				count=1;
			}
		}
		if(count>n/2)
			return majorityElement;
		return -1;
	}
	
	static int MajorityElementBoyerVotingAlgoOptimizedApproach(int n,List<Integer>arr) {
		if(arr.size()==1)
			return arr.get(0);
		int count=1;
		int majorityElement=arr.get(0);
		for(int i=1;i<n;i++) {
			if(majorityElement==arr.get(i))
				count++;
			else {
				count--;
				if(count==0)
				{
					majorityElement=arr.get(i);
					count=1;
				}
			}
		}
		count=0;
		for(int i=0;i<n;i++) {
			if(arr.get(i)==majorityElement)
				count++;
		}
		if(count>n/2)
			return majorityElement;
		return -1;
	}


	public static void main(String args[]) {
		//System.out.println(MajorityElementBoyerVotingAlgoBruteForce(5,Arrays.asList(3,1,3,3,2)));
		//System.out.println(MajorityElementBoyerVotingAlgoBruteForce(7,Arrays.asList(2,2,1,1,1,2,2)));
		 // System.out.println(MajorityElementBoyerVotingAlgoSortingApproach(5,Arrays.asList(3,1,3,3,2)));
		 // System.out.println(MajorityElementBoyerVotingAlgoSortingApproach(7,Arrays.asList(2,2,1,1,1,2,2)));
		 // System.out.println(MajorityElementBoyerVotingAlgoOptimizedApproach(5,Arrays.asList(3,1,3,3,2)));
		  System.out.println(MajorityElementBoyerVotingAlgoOptimizedApproach(7,Arrays.asList(9)));

	}
}