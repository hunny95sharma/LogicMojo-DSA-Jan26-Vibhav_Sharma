package practise;

public class SearchInsertPosition {
	
	
	static int searchInsertPositionBruteForceAscending(int arr[],int target) {
		
		int i=0;
		for(;i<arr.length;i++) {
			if(arr[i]>target)
				break;
			if(arr[i]==target)
				return i;
			
		}
		if(i==arr.length)
			return i;
		return i;
		
	}
	
static int searchInsertPositionBinarySearchAscending(int arr[],int target) {
		
		int i=0;
		int j=arr.length-1;
		int mid=-1;
		int res=-1;
		while(i<=j) {
			mid=i+(j-i)/2;
			if(arr[mid]<target) {
				i=mid+1;
			}
			else if(arr[mid]>target) {
				res=mid;
				j=mid-1;
			}else {
				return mid;
			}
			
			
		}
		
		return res==-1?arr.length:res;
		
	}

static int searchInsertPositionBinarySearchDescending(int arr[],int target) {

	int i=0;
	int j=arr.length-1;
	int mid=-1;
	int res=-1;
	while(i<=j) {
		mid=i+(j-i)/2;
		if(arr[mid]<target) {
			res=mid;
			j=mid-1;
		}
		else if(arr[mid]>target) {
			i=mid+1;
		}else {
			return mid;
		}


	}

	return res==-1?arr.length:res;

}
	
public static void main(String args[]) {
	
	System.out.println(searchInsertPositionBinarySearchDescending(new int[] {6,5,3,1},5));
	System.out.println(searchInsertPositionBinarySearchDescending(new int[] {6,5,3,1},2));
	System.out.println(searchInsertPositionBinarySearchDescending(new int[] {6,5,3,1},7));
}
	

}