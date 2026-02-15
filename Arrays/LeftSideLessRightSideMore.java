package practise;

import java.util.Arrays;
import java.util.List;

public class LeftSideLessRightSideMore {

	public static int leftSideLessRightSideMoreBruteForce(List<Integer> arr) {
		int n=arr.size();
		for(int i=1;i<=n-2;i++) {
			int left=i-1;
			int right=i+1;
			boolean isLeftSideLessRightSideMore=true;
			while(left>=0&&right<n) {
				if(arr.get(i)<arr.get(left)||arr.get(i)>arr.get(right))
				{
					isLeftSideLessRightSideMore=false;
					break;
				}
				left--;
				right++;
			}
			if(isLeftSideLessRightSideMore)
				return arr.get(i);
		}
		return -1;
	}
	
	public static int leftSideLessRightSideMoreApproach1(List<Integer> arr) {
		int n=arr.size();
		int maxFromLeft[]=new int[n];
		int minFromRight[]=new int[n];
		maxFromLeft[0]=arr.get(0);
		for(int i=1;i<n;i++) {
			if(arr.get(i)>=maxFromLeft[i-1]) {
				maxFromLeft[i]=arr.get(i);
			}
			else {
				maxFromLeft[i]=maxFromLeft[i-1];
			}
		}
		minFromRight[n-1]=arr.get(n-1);
		for(int i=n-2;i>=0;i--) {
			if(arr.get(i)<=minFromRight[i+1]) {
				minFromRight[i]=arr.get(i);
		}
		else {
			minFromRight[i]=minFromRight[i+1];
		}
		}
		for(int i=1;i<=n-2;i++) {
			if(arr.get(i)>=maxFromLeft[i]&&arr.get(i)<=minFromRight[i])
				return arr.get(i);
		}
		return -1;
	}
	
	public static int leftSideLessRightSideMoreApproach2(List<Integer> arr) {
		int n=arr.size();
		int maxFromLeft=arr.get(0);
		int minFromRight[]=new int[n];
		minFromRight[n-1]=arr.get(n-1);
		for(int i=n-2;i>=0;i--) {
			if(arr.get(i)<=minFromRight[i+1]) {
				minFromRight[i]=arr.get(i);
		}
		else {
			minFromRight[i]=minFromRight[i+1];
		}
		}
		for(int i=1;i<=n-2;i++) {
			if(maxFromLeft<=arr.get(i))
				maxFromLeft=arr.get(i);
			if(arr.get(i)>=maxFromLeft&&arr.get(i)<=minFromRight[i])
				return arr.get(i);
		}
		return -1;
	}
	
	public static void main(String args[]) {
		
		System.out.println(leftSideLessRightSideMoreApproach1(Arrays.asList(1, 2, 3, 4, 0)));
	}
	
}