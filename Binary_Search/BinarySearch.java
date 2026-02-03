package practise;

public class BinarySearch {
	

	static int BinarySearchIncreasing(int arr[],int target) {
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			int mid=i+(j-i)/2;
			if(target>arr[mid])
				i=mid+1;
			else if(target<arr[mid])
				j=mid-1;
			else {
				return mid;
			}
		}
		return -1;
	}
	
	static int BinarySearchDecreasing(int arr[],int target) {
		int i=0;
		int j=arr.length-1;
		while(i<=j) {
			int mid=i+(j-i)/2;
			if(target>arr[mid])
				j=mid-1;
			else if(target<arr[mid])
				i=mid+1;
			else {
				return mid;
			}
		}
		return -1;
	}
	
	static int BinarySearchFull(int arr[],int target) {
		int length=arr.length-1;
		if(arr[0]>arr[length])
			return BinarySearchDecreasing(arr,target);
		else {
			return BinarySearchIncreasing(arr,target);
		}
		
	}
	
	
	public static void main(String args[]) {
		System.out.println(BinarySearchFull(new int[] {1,1,2,2,2,3,3,3,3,4,4,4,4,4,5},5));
	}
	
	
}