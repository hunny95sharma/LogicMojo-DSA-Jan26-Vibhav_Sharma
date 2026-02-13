package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountDistinctAbsoluteValueInSortedArray {

	static int countDistinctAbsoluteValueInSortedArrayBruteForce(int n, List<Integer> arr){
		
		Set<Integer>res=new HashSet<>();
		for(int i=0;i<n;i++) {
			int x=arr.get(i)<0?arr.get(i)*-1:arr.get(i);
				res.add(x);
		}
		System.out.println(res);
		return res.size();
	}
	
static int countDistinctAbsoluteValueInSortedArrayTwoPointer(int n, List<Integer> arr){
		int start=0;
		int end=n-1;
		int count=n;
		Set<Integer>res=new HashSet<>(arr);
		while(start<end) {
			while(start!=end&&arr.get(end-1)==arr.get(end)) {
				count--;
				end--;
			}
			while(start!=end&&arr.get(start)==arr.get(start+1)) {
				count--;
				start++;
			}
			if(start==end)
				break;
			
			if((arr.get(end)+arr.get(start))==0) {
				res.remove(-1*arr.get(end));
				count--;
				start++;
				end--;
			}else if((arr.get(end)+arr.get(start))>0) {
				end--;
			}else {
				start++;
			}
		}
		System.out.println(res);
		return count;
		
	}
	
	public static void main(String args[]) {
		
		System.out.println(countDistinctAbsoluteValueInSortedArrayTwoPointer(6,Arrays.asList(-1,-1,0,1,1,1)));
		System.out.println(countDistinctAbsoluteValueInSortedArrayTwoPointer(5,Arrays.asList(0,0,0,0,0)));
	}
	
}