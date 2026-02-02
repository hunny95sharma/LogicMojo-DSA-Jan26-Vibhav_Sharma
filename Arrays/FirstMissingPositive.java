package practise;

import java.util.Arrays;
import java.util.List;

public class FirstMissingPositive {

	public static int firstMissingPositiveBruteForce(int n, List<Integer> arr) {
	    
		

		for(int x=1;x<=n;x++) {
			boolean isPresent=false;
			for(int num:arr) {
				if(num==x)
				{
					isPresent=true;
					break;
				}
			}
			if(!isPresent)
				return x;
		}
		return n+1;
	    }
	
public static int firstMissingPositiveWithExtraSpace(int n, List<Integer> arr) {
	    
		boolean found[]=new boolean[n+1];

		for(int i=0;i<n;i++) {
			if(arr.get(i)>0&& arr.get(i)<=n)
			found[arr.get(i)]=true;
		}
		for(int i=1;i<found.length;i++)
		{
			if(!found[i])
				return i;
		}
		return n+1;
	    }

public static int firstMissingPositiveWithOutExtraSpace(int n, List<Integer> arr) {
    boolean isOnePresent=false;
    for(int i=0;i<arr.size();i++) {
    	if(arr.get(i)==1)
    		isOnePresent=true;
    	if(arr.get(i)<=0 || arr.get(i)>n)
    		arr.set(i, 1);
    	
    }
    if(!isOnePresent)
    	return 1;
    for(int i=0;i<arr.size();i++) {
    	int data=arr.get(i);
		if(data<0)
		{
			data=data*-1;
		}
		int idx=data-1;
		if(arr.get(idx)>0)
			arr.set(idx, -1*arr.get(idx));
    }
    
    for(int i=0;i<arr.size();i++) {
		if(arr.get(i)>0) {
			return i+1;
		}
			
	}
	return n+1;
    }
	
	public static void main(String args[]) {
		System.out.println(firstMissingPositiveWithOutExtraSpace(4,Arrays.asList(3,4,-1,1)));
	}
	
}