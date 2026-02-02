package practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumClosest {
	
	
	static String threeSumClosestBruteForce(List<Integer>arr,int target){
		int minimumVal=Integer.MAX_VALUE;
		String bestTriplet = "";
		for(int i=0;i<=arr.size()-3;i++ ) {
			for(int j=i+1;j<=arr.size()-2;j++) {
				for(int k=j+1;k<=arr.size()-1;k++) {
					int sum=arr.get(i)+arr.get(j)+arr.get(k);
					if(sum==target) {
						bestTriplet="("+arr.get(i)+","+arr.get(j)+","+arr.get(k)+")";
						return bestTriplet;
					}else {
						int diff = Math.abs(target - sum);
						if(diff<minimumVal) {
							minimumVal=diff;
							bestTriplet="("+arr.get(i)+","+arr.get(j)+","+arr.get(k)+")";
						}
					}
				}
			}
		}
		return bestTriplet;
	}
	
	static String threeSumClosestOptimized(List<Integer>arr,int target){
		Collections.sort(arr);
		int minimumVal=Integer.MAX_VALUE;
		String bestTriplet = "";
		for(int i=0;i<arr.size()-2;i++) {
			int left=i+1;
			int right=arr.size()-1;
			while(left<right) {
				int sum=arr.get(i)+arr.get(left)+arr.get(right);
				int diff = Math.abs(target - sum);

	            if (diff < minimumVal) {
	            	minimumVal = diff;
	                bestTriplet = "(" + arr.get(i) + "," + arr.get(left) + "," + arr.get(right) + ")";
	            }
				if(sum==target) {
					return bestTriplet;
				}
				if(sum<target)
					left++;
				else
					right--;
			}
		}
		return bestTriplet;
		
	}
	
	public static void main(String args[]) {
		System.out.println(threeSumClosestBruteForce(Arrays.asList(-1,2,1,-4),1));
		System.out.println(threeSumClosestOptimized(Arrays.asList(-1,2,1,-4),1));
	}
	
	

}
