package practise;

import java.util.Arrays;

public class ContainerWithMaximumWater {
	
	
	static int[] ContainerWithMaximumWaterBruteForce(int height[]) {
		
		
		int maximumArea=0;
		int startIndex=-1;
		int endIndex=-1;
		for(int i=0;i<height.length;i++) {	
			for(int j=i+1;j<height.length;j++) {
				int max=0;
				if(height[i]<height[j]) {
					max=height[i]*(j-i);
				}else {
					max=height[j]*(j-i);
				}
				if(max>maximumArea) {
					maximumArea=max;
					startIndex=i;
					endIndex=j;
				}
				
			}
		}
		return new int[] {maximumArea,startIndex,endIndex};
		
	}
	
static int[] ContainerWithMaximumWaterOptimized(int height[]) {
		
		
		int maximumArea=0;
		int startIndex=-1;
		int endIndex=-1;
		for(int i=0,j=height.length-1;i<j;) {
			int max=0;
			if(height[i]<height[j]) {
				max=height[i]*(j-i);
			}else {
				max=height[j]*(j-i);
			}
			if(max>maximumArea) {
				maximumArea=max;
				startIndex=i;
				endIndex=j;
			}
			if(height[i]>height[j]) {
				j--;
			}else {
				i++;
			}
			
		}
		return new int[] {maximumArea,startIndex,endIndex};
		
	}

	public static void main(String args[]) {
		
		System.out.println(Arrays.toString(ContainerWithMaximumWaterBruteForce(new int[] {1,8,6,2,5,4,8,3,7})));
		
	}
	
	
}