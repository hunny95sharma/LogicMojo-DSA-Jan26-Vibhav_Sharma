package practise;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicatesInArray {
	
	
	
	static List<Integer> AllDuplicatesInArrayBruteForce(int arr[]) {
		List<Integer>result=new ArrayList<Integer>();
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count==2)
				result.add(arr[i]);
		}
		return result;
	}
	
	static List<Integer> AllDuplicatesInArrayOptimized(int arr[]) {
		List<Integer>result=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			int data=arr[i];
			if(data<0)
			{
				data=data*-1;
			}
			int idx=data-1;
			if(arr[idx]>0)
				arr[idx]=-1*arr[idx];
			else {
				result.add(data);
			}
		
		}
		return result;
	}
	
public static void main(String args[]) {
	System.out.println(AllDuplicatesInArrayBruteForce(new int[] {3,1,3,5,6,8,9,8}));
}
	
}