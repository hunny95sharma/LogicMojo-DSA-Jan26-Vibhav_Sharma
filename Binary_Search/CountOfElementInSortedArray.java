package practise;

public class CountOfElementInSortedArray {

	
	static int countOfElementInSortedArray(int arr[],int target) {
	
		int i=0;
		int j=arr.length-1;
		int first=-1;
		while(i<=j) {
			int mid=i+(j-i)/2;
			if(arr[mid]>target)
				j=mid-1;
			else if(arr[mid]<target)
				i=mid+1;
			else {
				first=mid;
				j=mid-1;
			}
			
		}
		i=0;
		 j=arr.length-1;
		int last=-1;
		while(i<=j) {
			int mid=i+(j-i)/2;
			if(arr[mid]>target)
				j=mid-1;
			else if(arr[mid]<target)
				i=mid+1;
			else {
				last=mid;
				i=mid+1;
			}
			
			
		}
		return last-first+1;
	}
	
	public static void main(String args[]) {
		
		System.out.println(countOfElementInSortedArray(new int[] {5,7,7,8,8,8,10},8));

	}
	
}