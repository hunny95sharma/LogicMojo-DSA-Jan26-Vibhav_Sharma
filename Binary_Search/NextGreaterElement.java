package practise;

public class NextGreaterElement {

	static char nextGreaterElement(char arr[],char target) {
		
		int i=0;
		int j=arr.length-1;
		int res=-1;
		
		while(i<=j) {
			int mid=i+(j-i)/2;
			if(arr[mid]==target)
				return target;
			else if((int)arr[mid]>(int)target) {
				res=mid;
				j=mid-1;
			}
			else {
				i=mid+1;
			}
			
			
		}
		return res==-1?arr[0]:arr[res];
	}
	
	public static void main(String args[]) {
		System.out.println(nextGreaterElement(new char[] {'a','c','e','g'},'h'));
		
	}
}