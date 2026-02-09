package practise;

public class SearchInfiniteSortedArray {
	
	
	static int searchInfiniteSortedArrayBinarySearch(int arr[],int target) {
		
		int start=0;
		int end=1;
		if(arr.length==0)
			return -1;
		if(arr.length==1)
			return arr[start]==target?start:-1;
		while(arr[end]<=target) {
			start=end;
			end*=2;	
		}
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
			
			
		}
		return -1;
		
	}

}