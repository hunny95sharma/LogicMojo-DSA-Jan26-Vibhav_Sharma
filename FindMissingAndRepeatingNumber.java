package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingAndRepeatingNumber {

	
	public static List<Integer> find_missing(List<Integer> arr) {
		List<Integer>result=new ArrayList<Integer>();
		List<Integer>input=new ArrayList<Integer>();
		for(int x:arr)
			input.add(x);
		for(int i=0;i<input.size();i++) {
			int data=input.get(i);
			if(data<0)
			{
				data=data*-1;
			}
			int idx=data-1;
			if(input.get(idx)>0)
				input.set(idx, -1*input.get(idx));
			else {
				result.add(data);
			}
			
		}
		for(int i=0;i<input.size();i++) {
			if(input.get(i)>0) {
				result.add(i+1);
			}
				
		}
		return result;

	    }
	
	public static void main(String args[]) {
		System.out.println(find_missing(Arrays.asList(3,1,3)));
	}
	
}