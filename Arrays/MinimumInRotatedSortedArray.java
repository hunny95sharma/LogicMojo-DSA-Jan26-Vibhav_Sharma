package practise;

public class MinimumInRotatedSortedArray {
	
	
	static int minimumInRotatedSortedArrayBinarySearchUnique(int arr[]) {
		int low=0;
		int high=arr.length-1;
		int min=Integer.MAX_VALUE;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[low]<=arr[mid]) {
				if(arr[low]<min) {
					min=arr[low];
				}
					low=mid+1;
				}
				else {
					if(arr[mid]<min)
						min=arr[mid];
					high=mid-1;
				}
					
			}
			
		return min;	
			
		}
	
	static int minimumInRotatedSortedArrayBinarySearchDuplicate(int arr[]) {
		int low=0;
		int high=arr.length-1;
		int min=Integer.MAX_VALUE;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==arr[low]&&arr[mid]==arr[high]) {
                if(arr[mid]<min)
                min=arr[mid];
				low++;
				high--;
			}
			else if(arr[low]<=arr[mid]) {
				if(arr[low]<min) {
					min=arr[low];
				}
					low=mid+1;
				}
				else {
					if(arr[mid]<min)
						min=arr[mid];
					high=mid-1;
				}
					
			}
			
		return min;	
			
		}
		
		
	
	
	public static void main(String args[]) {
		
		System.out.println(minimumInRotatedSortedArrayBinarySearchUnique(new int[] {4, 5, 6, 7, 1, 2, 3}));
		
	}

}