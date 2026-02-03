package practise;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {

	
	static int[] RemoveDuplicateSortedArrayExtraSpace(int arr[]) {
		int k=0;
		int result[]=new int[arr.length];
		result[k++]=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1])
				continue;
			else {
				result[k++]=arr[i];
			}
		}
		return result;
	}
	
	static int[] RemoveDuplicateSortedArrayWithoutExtraSpace(int arr[]) {
		int i=1;
		int j=0;
		while(i<arr.length) {
			if(arr[i]==arr[i-1]) {
				i++;
			}
			else {
				j++;
				arr[j]=arr[i];
				i++;
			}
		}
		for(i=j+1;i<arr.length;i++)
			arr[i]=0;
		return arr;
	}
	
	static int[] RemoveDuplicateSortedArrayWithoutExtraSpaceOneMore(int arr[]) {
		int i=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i]==arr[j]) {
				i++;
			}else {
				j++;
				arr[j]=arr[i];
				i++;
			}
		}
		for(i=j+1;i<arr.length;i++)
			arr[i]=0;
		return arr;
	}
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(RemoveDuplicateSortedArrayWithoutExtraSpace(new int[] {2,3,3,3,6,9,9})));
		System.out.println(Arrays.toString(RemoveDuplicateSortedArrayWithoutExtraSpace(new int[] {2,2,2,1,1})));
		System.out.println(Arrays.toString(RemoveDuplicateSortedArrayExtraSpace(new int[] {2,3,3,3,6,9,9})));
		System.out.println(Arrays.toString(RemoveDuplicateSortedArrayExtraSpace(new int[] {2,2,2,1,1})));
		System.out.println(Arrays.toString(RemoveDuplicateSortedArrayWithoutExtraSpaceOneMore(new int[] {2,3,3,3,6,9,9})));
		System.out.println(Arrays.toString(RemoveDuplicateSortedArrayWithoutExtraSpaceOneMore(new int[] {2,2,2,1,1})));
	}
	
}
