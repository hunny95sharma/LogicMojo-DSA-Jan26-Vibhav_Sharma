package practise;

import java.util.Arrays;
import java.util.List;

public class SingleElementSortedArray {

	
	static int singleElementInSortedArrayBinarySearch(int n, List<Integer> arr) {
		int start=0;
		int end=n-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(mid%2==1)
				mid--;
			if(arr.get(mid).equals(arr.get(mid+1))) {
				start=mid+2;
			}else {
				end=mid;
			}
		}
		return arr.get(start);
	}
	
	static int singleElementInSortedArrayBruteForce(int n, List<Integer> arr) {
			if(n==1)return arr.get(0);
			for(int i=0;i<n;i++)
			{
				 if(i==0&&arr.get(0)!=arr.get(1))return arr.get(0);
				 else if((i==n-1) && arr.get(n-1)!=arr.get(n-2))return arr.get(n-1);
				 else {
				if(arr.get(i)!=arr.get(i+1) && arr.get(i)!=arr.get(i-1))
					return arr.get(i);
				 }
			}
			return -1;
	    }
	
	public static void main(String args[]) {
		
		System.out.println(singleElementInSortedArrayBinarySearch(9,Arrays.asList(1,1,2,2,3,3,4,4,5)));
		

		
	}
	
}