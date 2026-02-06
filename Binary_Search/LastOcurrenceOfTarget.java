package practise;

public class LastOcurrenceOfTarget {
	
	static int lastOcurrenceOfTarget(int arr[],int target) {
		int i=0;
		int j=arr.length-1;
		int res=-1;
		while(i<=j) {
			int mid=i+(j-i)/2;
			if(arr[mid]>target)
				j=mid-1;
			else if(arr[mid]<target)
				i=mid+1;
			else {
				res=mid;
				i=mid+1;
			}
			
			
		}
		return res;
	}
	

	public static void main(String args[]) {
		System.out.println(lastOcurrenceOfTarget(new int[] {5,7,7,8,8,10},8));
		
	}
	
}