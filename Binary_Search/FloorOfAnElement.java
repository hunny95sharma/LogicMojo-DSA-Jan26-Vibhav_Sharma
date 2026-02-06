package practise;

public class FloorOfAnElement {

	
	static int floorOfAnElementBruteForce(int arr[],int target) {
		
		int i=0;
		for(;i<arr.length;i++) {
			
			if(arr[i]>=target)
				break;
			
		}
		if(i<arr.length)
		{
			
			if(arr[i]==target)
				return target;
			else
				return arr[i-1];
			
		}else {
			return -1;
		}
		
	}
	
static int floorOfAnElementBinarySearch(int arr[],int target) {
		int i=0;
		int j=arr.length-1;
		int res=-1;
		while(i<=j){
			int mid=i+(j-i)/2;
			if(arr[mid]==target)
				return target;
			else if(arr[mid]>target) {
				j=mid-1;
			}else {
				res=arr[mid];
				i=mid+1;
			}
			
		}
		return res;
	}
	
	public static void main(String args[]) {
		
		System.out.println(floorOfAnElementBruteForce(new int[] {1,3,5,6,8,9},7));
		
	}
}