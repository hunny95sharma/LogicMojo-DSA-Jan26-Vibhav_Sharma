package practise;

import java.util.Arrays;

public class Kadanes {

	static int [] maxSubArraySumWithOutKadanes(int arr[])
	{
		int startIndex=Integer.MIN_VALUE;
		int endIndex=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=0;
			for(int j=i;j<arr.length;j++) {
				
				sum+=arr[j];
				if(sum>max)
				{
					max=sum;
					startIndex=i;
					endIndex=j;
				}
			}
		}
		return new int[] {max,startIndex,endIndex};
		}
	
	static int [] maxSubArraySumWithKadanesAlgo1(int arr[]) {
		int curSum=0;
		int maxSum=Integer.MIN_VALUE;
		int startIndex=0;
		int endIndex=0;
		int tempStart = 0;
		for(int i=0;i<arr.length;i++) {
			curSum+=arr[i];
			if(curSum>maxSum) {
				maxSum=curSum;
				startIndex=tempStart;
				endIndex=i;
			}
			if(curSum<0) {
				curSum=0;
				tempStart=i+1;
			}
		}
		return new int[] {maxSum,startIndex,endIndex};
	}
	
	static int [] maxSubArraySumWithKadanesAlgo2(int arr[]) {
		int maxBestCase=arr[0];
		int maxSum=arr[0];
		int startIndex=0;
		int endIndex=0;
		int tempIndex=0;
		for(int i=1;i<arr.length;i++) {
			int v1=arr[i]+maxBestCase;
			int v2=arr[i];
			if(v1>v2)
				maxBestCase=v1;
			else {
				maxBestCase=v2;
				tempIndex=i;
			}
			if(maxBestCase>maxSum) {
				maxSum=maxBestCase;
				endIndex=i;
				startIndex=tempIndex;
			}
			
		}
		return new int[] {maxSum,startIndex,endIndex};
	}
	
	static int[] minSubArraySumWithKadanes(int arr[]) {
	 int minBestCase=arr[0];
	 int minSum=arr[0];
	 int startIndex=0;
	 int endIndex=0;
	 int tempIndex=0;
	 for(int i=1;i<arr.length;i++) {
		 int v1=arr[i];
		 int v2=minBestCase+arr[i];
		 if(v1<v2)
		 {
			 minBestCase=v1;
			 tempIndex=i;
			 
		 }
		 else
			 minBestCase=v2;
		 if(minBestCase<minSum) {
			 minSum=minBestCase;
		 endIndex=i;
		 startIndex=tempIndex;
		 }
	 }
	 return new int []{minSum,startIndex,endIndex};
	}
	
	static int [] minSubArraySumWithOutKadanes(int arr[])
	{
		
		int min=Integer.MAX_VALUE;
		int currSum=0;
		int startIndex=0;
		int endIndex=0;
		for(int i=0;i<arr.length;i++) {
			currSum=0;
			
			for(int j=i;j<arr.length;j++) {
				currSum+=arr[j];
				if(currSum<min) {
					min=currSum;
					startIndex=i;
					endIndex=j;
				}
			}
		}
		return new int [] {min,startIndex,endIndex};
		}
	
	static int [] maxSubArrayProductWithoutKadanes(int arr[]) {
		int max=Integer.MIN_VALUE;
		int currProduct=1;
		int startIndex=0;
		int endIndex=0;
		for(int i=0;i<arr.length;i++) {
			currProduct=1;
			for(int j=i;j<arr.length;j++) {
				currProduct*=arr[j];
				if(currProduct>max) {
					max=currProduct;
					startIndex=i;
					endIndex=j;
				}
			}
		}
		return new int[] {max,startIndex,endIndex};
	}
	
	static int [] maxSubArrayProductWithKadanes(int arr[]) {
		int maxBestCase=arr[0];
		int minBestCase=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			int v1=arr[i];
			int v2=arr[i]*maxBestCase;
			int v3=arr[i]*minBestCase;

			if(v2>v3)
			{
				if(v1>v2) {
					maxBestCase=v1;
				}else {
					maxBestCase=v2;
				}

			}else {

				if(v1>v3) {
					maxBestCase=v1;
				}else {
					maxBestCase=v3;
				}
			}

			if(v2<v3) {
				if(v1<v2) {
					minBestCase=v1;
				}else {
					minBestCase=v2;
				}

			}else {
				if(v1<v3) {
					minBestCase=v1;
				}else {
					minBestCase=v3;
				}
			}
			if(maxBestCase>minBestCase) {
				if(maxBestCase>max) {
					max=maxBestCase;
				}
			}else {
				if(minBestCase>max) {
					max=minBestCase;
				}
			}
		}
		return new int[] {max};
	}
	
	public static void main(String args[]) {
		int arr[]= {-1,-2,-3,0};
		//int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		//int arr[]= {4,-1,2,1};
		//int arr[]= {1};
		//int arr[]= {5,4,-1,7,8};
		//int arr[]= {30,5,-36,1,6};
		int result1[]=maxSubArrayProductWithoutKadanes(arr);
		System.out.println(Arrays.toString(result1));
		int result2[]=maxSubArrayProductWithKadanes(arr);
		System.out.println(Arrays.toString(result2));
	}
	
}