package practise;

import java.util.Arrays;

public class MinimumSizeSubArraySum {
	
	
	static int[] MinimumSizeSubArraySumBruteForce(int arr[],int target) {
		
		int minLength=Integer.MAX_VALUE;
		int startIndex=-1;
		int endIndex=-1;
		
		
		for(int k=1;k<=arr.length;k++) {
			for(int i=0;i<=arr.length-k;i++) {
				int sum=0;
				int j=i;
				for(;j<i+k;j++) {
					sum=sum+arr[j];
				}
				if(sum>=target) {
					if((j-i)<minLength) {
						minLength=j-i;
						startIndex=i;
						endIndex=j-1;
					}
				}
			}
		}
		if(startIndex==-1)
			 return new int[] {0,startIndex,endIndex};
	return new int[] {minLength,startIndex,endIndex};
	}
	
static int[] MinimumSizeSubArraySumOptimized(int arr[],int target) {
		
		int minLength=Integer.MAX_VALUE;
		int startIndex=-1;
		int endIndex=-1;
		int start=0;
		int end=0;
		int sum=0;
		while(end<arr.length) {
			sum=sum+arr[end];
			while(sum>=target) {
				if((end-start+1)<minLength) {
					minLength=end-start+1;
					startIndex=start;
					endIndex=end;
				}
				sum=sum-arr[start];
				start++;
			}
			end++;
		}
		
		
		if(startIndex==-1)
			 return new int[] {0,startIndex,endIndex};
	return new int[] {minLength,startIndex,endIndex};
	}
	
	public static void main(String args[]) {
		
		System.out.println(Arrays.toString(MinimumSizeSubArraySumBruteForce(new int[] {2,3,1,2,4,3},7)));
		System.out.println(Arrays.toString(MinimumSizeSubArraySumBruteForce(new int[] {1,4,4},4)));
		System.out.println(Arrays.toString(MinimumSizeSubArraySumBruteForce(new int[] {1,1,1,1,1,1,1,1},11)));
		System.out.println(Arrays.toString(MinimumSizeSubArraySumOptimized(new int[] {2,3,1,2,4,3},7)));
		System.out.println(Arrays.toString(MinimumSizeSubArraySumOptimized(new int[] {1,4,4},4)));
		System.out.println(Arrays.toString(MinimumSizeSubArraySumOptimized(new int[] {1,1,1,1,1,1,1,1},11)));
		System.out.println(Arrays.toString(MinimumSizeSubArraySumBruteForce(new int[] {2,3,1,2,4,3},7)));
		System.out.println(Arrays.toString(MinimumSizeSubArraySumOptimized(new int[] {2,3,1,2,4,3},7)));
	}

}