package practise;

public class SearchInRotatedSortedArray {

	static int searchInRotatedSortedArrayBinarySearchUnique(int arr[],int target) {
		
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target)
				return mid;
			if(arr[low]<=arr[mid]) {
				if(target>=arr[low]&&target<arr[mid]) 
					high=mid-1;
				else
					low=mid+1;
					
			}
			else {
				if(target<=arr[high]&&target>arr[mid]) 
					low=mid+1;
				else
					high=mid-1;
			}
			
		}
		return -1;
		
	}
	
static boolean searchInRotatedSortedArrayBinarySearchDuplicate(int arr[],int target) {
		
	int low=0;
	int high=arr.length-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(arr[mid]==target)
			return true;
		if(arr[mid]==arr[low]&&arr[mid]==arr[high]) {
			low++;
			high--;
		}
		else if(arr[low]<=arr[mid]) {
			if(target>=arr[low]&&target<arr[mid]) 
				high=mid-1;
			else
				low=mid+1;
				
		}
		else {
			if(target<=arr[high]&&target>arr[mid]) 
				low=mid+1;
			else
				high=mid-1;
		}
		
	}
	return false;
		
	}
	
	public static void main(String args[]) {
		
		System.out.println(searchInRotatedSortedArrayBinarySearchUnique(new int[] {4 ,5 ,6 ,7 ,0 ,1 ,2},1));
		
	}
	
	
}