package practise;

import java.util.Arrays;

public class PrefixSum {
	
	static int []  sumOfArray(int arr[]) {
		int count=0;
		for(int element:arr){
			count=count+element;
			
		}
		return new int[]{count};
	}
	
	static int[] prefixSumWithExtraSpace(int arr[]) {
		int result[]=new int [arr.length];
		int sum=0;
		int k=0;
		for(int element:arr) {
			sum=sum+element;
			result[k++]=sum;
		}
		return result;
	}
	
	static int[] prefixSumWithoutExtraSpace(int arr[]) {
		int k=0;
		for(int element:arr) {
			if(k==0)
			arr[k++]=element;
			else {
				arr[k]=arr[k-1]+element;
				k++;
			}
		}
		return arr;
	}
	
	public static void main(String args[]) {
		/*int arr[]= {1,2,3,4,5,6,7};
		int arrResult[]=sumOfArray(arr);
		System.out.println(Arrays.toString(arrResult));		*/
		int arr[]= {10,20,30,40,50};
		int result[]=prefixSumWithExtraSpace(arr);
		System.out.println(Arrays.toString(result));
		/*int arr[]= {3,4,5,6,7};
		prefixSumWithoutExtraSpace(arr);
		System.out.println(Arrays.toString(arr));*/
	}
	
}