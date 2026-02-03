package practise;

import java.util.Arrays;

public class SquareOfSortedArray {

	static int[]sqaureOfSortedArrayBruteForce(int arr[]){
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=(arr[i]*arr[i]);
		}
		Arrays.sort(res);
		return res;
	}
	
	static int[]sqaureOfSortedArrayOptimized(int arr[]){
		int i=0;
		int j=arr.length-1;
		int res[]=new int[arr.length];
		int k=arr.length-1;
		while(i<=j) {
			if((arr[i]*arr[i])>(arr[j]*arr[j])) {
			res[k--]=arr[i]*arr[i];
			i++;
			}
			else {
				res[k--]=arr[j]*arr[j];
				j--;
			}
			}
		return res;
		}	
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(sqaureOfSortedArrayBruteForce(new int[] {-2,-1,0,2,3})));
		System.out.println(Arrays.toString(sqaureOfSortedArrayBruteForce(new int[] {-3,-1,0,1,2})));
		System.out.println(Arrays.toString(sqaureOfSortedArrayOptimized(new int[] {-2,-1,0,2,3})));
		System.out.println(Arrays.toString(sqaureOfSortedArrayOptimized(new int[] {-3,-1,0,1,2})));
	}
	
	
}