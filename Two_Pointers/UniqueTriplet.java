package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class UniqueTriplet {
	
	
	static List<String> uniqueTripletBruteForce(List<Integer>arr,int target){
		HashSet<String> result = new HashSet<>();
		for(int i=0;i<=arr.size()-3;i++ ) {
			List<Integer>list=null;
			for(int j=i+1;j<=arr.size()-2;j++) {
				for(int k=j+1;k<=arr.size()-1;k++) {
					if((arr.get(i)+arr.get(j)+arr.get(k))==target) {
						list=Arrays.asList(arr.get(i),arr.get(j),arr.get(k));
						Collections.sort(list);
						result.add("("+list.get(0)+","+list.get(1)+","+list.get(2)+")");
					}
				}
			}
		}
		return new ArrayList<>(result);
	}
	
	static List<String> uniqueTripletOptimized(List<Integer>arr,int target){
		HashSet<String> result = new HashSet<>();
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++) {
			List<Integer>list=null;
			for(int j=i+1,k=arr.size()-1;j<k;) {
				int sum=arr.get(i)+arr.get(j)+arr.get(k);
				if(sum>target) {
					k--;
				}else if(sum<target) {
					j++;
				}else {
					list=Arrays.asList(arr.get(i),arr.get(j),arr.get(k));
					Collections.sort(list);
					result.add("("+list.get(0)+","+list.get(1)+","+list.get(2)+")");
					j++;
					k--;
					
				}
				
			}
		}
		return new ArrayList<>(result);
	}
	
	public static void main(String args[]) {
		System.out.println(uniqueTripletBruteForce(Arrays.asList(-1,-1,0,1),0));
		System.out.println(uniqueTripletOptimized(Arrays.asList(-1,-1,0,1),0));
	}

}
