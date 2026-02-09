package practise;

public class MinimumElementDifferenceSortedArray {
	
	
	static int minimumElementDifferenceSortedArrayBinarySearch(int arr[],int target) {
		int i=0;
		int j=arr.length-1;
		int ceil=-1;
		while(i<=j) {
			int mid=i+(j-i)/2;
			if(arr[mid]==target) {
				ceil=mid;
				break;
			}
			else if(arr[mid]>target)
			{
				ceil=mid;
				j=mid-1;
			}else {
				i=mid+1;
			}	
		}
		i=0;
		j=arr.length-1;
		int floor=-1;
		while(i<=j) {
			int mid=i+(j-i)/2;
			if(arr[mid]==target) {
				floor=mid;
				break;
			}
			else if(arr[mid]>target)
			{
				j=mid-1;
			}else {
				floor=mid;
				i=mid+1;
			}	
		}
		
		int ceilAbs=Math.abs(target-arr[ceil]);
		int floorAbs=Math.abs(target-arr[floor]);
		return ceilAbs<floorAbs?arr[ceil]:arr[floor];
	}
	
	static int minimumElementDifferenceSortedArrayBruteForce(int arr[],int target) {
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=Math.abs(target-arr[i]);
		}
		int min=Integer.MAX_VALUE;
		int minIndex=-1;
		for(int i=0;i<res.length;i++) {
			if(res[i]<min) {
				min=res[i];
				minIndex=i;
			}	
		}
		return arr[minIndex];
	}
	
	public static void main(String args[]) {
		System.out.println(minimumElementDifferenceSortedArrayBinarySearch(new int[] {1,3,8,10,15},12));
		System.out.println(minimumElementDifferenceSortedArrayBinarySearch(new int[] {4,6,10},7));
		System.out.println(minimumElementDifferenceSortedArrayBruteForce(new int[] {1,3,8,10,15},12));
		System.out.println(minimumElementDifferenceSortedArrayBruteForce(new int[] {4,6,10},7));
	}

}