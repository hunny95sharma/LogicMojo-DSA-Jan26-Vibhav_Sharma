package practise;

public class FirstOccurenceOfOneInBinarySortedArray {
	
	
	static int firstOccurenceOfOneInBinarySortedArrayBinarySearch(int arr[]) {
		
		int start=0;
		int end=1;
		if(arr.length==0)return -1;
		if(arr.length==1)
			return arr[start]==1?start:-1;
		while(arr[end]!=1) {
			start=end;
			end*=2;
		}
		int res=-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]<1)
				start=mid+1;
			else if(arr[mid]>1)
				end=mid-1;
			else {
				res=end;
				end=mid-1;
			}
			
		}
		
		return res;
		
	}
	
	public static void main(String args[]) {
		
		System.out.println(firstOccurenceOfOneInBinarySortedArrayBinarySearch(new int[] {0,0,1,1,1}));
		System.out.println(firstOccurenceOfOneInBinarySortedArrayBinarySearch(new int[] {1,1,1,1,1,1}));
	}
	

}