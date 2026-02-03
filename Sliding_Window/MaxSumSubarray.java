package practise;

import java.util.Arrays;

public class MaxSumSubarray {
	
	
	static int[]MaxSumSubarrayBruteforce(int arr[],int k){
		int maxSum=Integer.MIN_VALUE;
		int startIndex=-1;
		int endIndex=-1;
		if(arr.length<k)
			return new int[] {0,startIndex,endIndex};
		for(int i=0;i<=arr.length-k;i++) {
			int sum=0;
			for(int j=i;j<(i+k);j++) {
				sum=sum+arr[j];
			}
			if(sum>maxSum) {
				maxSum=sum;
				startIndex=i;
				endIndex=i+k-1;
			}
			
		}
		return new int[] {maxSum,startIndex,endIndex};
	}
	
	static int[]maximumAverageSubarraySlidingWindow(int arr[],int k){
		int i=0;
		int j=0;
		int maxSum=Integer.MIN_VALUE;
		int currentWindowSum=0;
		int startIndex =-1;
		int endIndex=-1;
		if(arr.length<k)
			return new int[] {0,startIndex,endIndex};
		while(j<arr.length) {
			currentWindowSum=currentWindowSum+arr[j];
			if((j-i+1)==k) {
			if(currentWindowSum>maxSum) {
				maxSum=currentWindowSum;
				startIndex=i;
				endIndex=j;
			}
			currentWindowSum=currentWindowSum-arr[i];
			i++;
			}
			j++;
		}
		return new int[] {maxSum,startIndex,endIndex};
	}
	
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(MaxSumSubarrayBruteforce(new int[] {2,1,5,1,3,2},3)));
		System.out.println(Arrays.toString(MaxSumSubarrayBruteforce(new int[] {2,3,4,1,5},2)));
		System.out.println(Arrays.toString(MaxSumSubarrayBruteforce(new int[] {1,2},3)));
		System.out.println(Arrays.toString(maximumAverageSubarraySlidingWindow(new int[] {2,1,5,1,3,2},3)));
		System.out.println(Arrays.toString(maximumAverageSubarraySlidingWindow(new int[] {2,3,4,1,5},2)));
		System.out.println(Arrays.toString(maximumAverageSubarraySlidingWindow(new int[] {1,2},3)));
	}

}