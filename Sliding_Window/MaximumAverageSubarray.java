package practise;

import java.util.Arrays;

public class MaximumAverageSubarray {
	
	
	static double[]maximumAverageSubarrayBruteForce(int arr[],int k){
		
		int maxSum=Integer.MIN_VALUE;
		int startIndex =-1;
		int endIndex=-1;
		
		for(int i=0;i<=arr.length-k;i++) {
			int sum=0;
			for(int j=i;j<(i+k);j++) {
				sum+=arr[j];
			}
			if(sum>maxSum) {
				maxSum=sum;
				startIndex = i;
				endIndex=i+k-1;
			}
		}
		return new double[] {(double)maxSum/k,startIndex,endIndex};
		
	}
	
	static double[]maximumAverageSubarrayOptimized(int arr[],int k){
		int i=0;
		int j=0;
		int maxSum=Integer.MIN_VALUE;
		int currentWindowSum=0;
		int startIndex =-1;
		int endIndex=-1;
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
		return new double[] {(double)maxSum/k,startIndex,endIndex};
	}
	
	public static void main(String args[]) {
		
		System.out.println(Arrays.toString(maximumAverageSubarrayOptimized(new int[] {1,12,-5,-6,50,3},4)));
		System.out.println(Arrays.toString(maximumAverageSubarrayBruteForce(new int[] {1,12,-5,-6,50,3},4)));
		System.out.println(Arrays.toString(maximumAverageSubarrayBruteForce(new int[] {5},1)));
		System.out.println(Arrays.toString(maximumAverageSubarrayOptimized(new int[] {5},1)));		
	}
	

}