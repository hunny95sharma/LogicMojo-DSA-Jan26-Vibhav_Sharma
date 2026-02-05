package practise;

import java.util.Arrays;

public class LongestCountiguosSubArraySmallthanOrEqual {
	
	
	static int[] LongestCountiguosSubArraySmallthanOrEqualBruteForce(int arr[],int target){
		int maxLength=0;
		int startIndex=-1;
		int endIndex=-1;
		for(int k=1;k<=arr.length;k++) {
		for(int i=0;i<=arr.length-k;i++) {
			int sum=0;
			int j=i;
			for(;j<k+i;j++) {
				sum=sum+arr[j];
			}
			if(sum<=target) {
				if((j-i)>maxLength) {
					maxLength=j-i;
					startIndex=i;
					endIndex=j-1;
				}
			}
		}
	}
		return new int[] {maxLength,startIndex,endIndex};
	}
	
	static int[] LongestCountiguosSubArraySmallthanOrEqualOptimised(int arr[],int target){
		int maxLength=0;
		int startIndex=-1;
		int endIndex=-1;
		int start=0;
		int end=0;
		int sum=0;
		while(end<arr.length) {
			sum=sum+arr[end];
			
			while(sum>target) {
				sum=sum-arr[start];
				start++;
			}
			if(sum<=target) {
				if((end-start+1)>maxLength) {
					maxLength=end-start+1;
					startIndex=start;
					endIndex=end;
				}
			}
			
			
			end++;
		}
		return new int[] {maxLength,startIndex,endIndex};
	}
		

	
	public static void main(String args[]) {
		
		
		System.out.println(Arrays.toString(LongestCountiguosSubArraySmallthanOrEqualBruteForce(new int[] {4,1,1,1,2,3},5)));
		System.out.println(Arrays.toString(LongestCountiguosSubArraySmallthanOrEqualOptimised(new int[] {4,1,1,1,2,3},5)));
		System.out.println(Arrays.toString(LongestCountiguosSubArraySmallthanOrEqualBruteForce(new int[] {4,8,3,12,11,1,5,3,6,7},15)));
		System.out.println(Arrays.toString(LongestCountiguosSubArraySmallthanOrEqualOptimised(new int[] {4,8,3,12,11,1,5,3,6,7},15)));

	}
	
	
}