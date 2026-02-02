package practise;

import java.util.Arrays;

public class StockBuyAndSell {
	
	static int[] stockBuyAndSaleBruteForce(int arr[]){
	
		int maxProfit=0;
		int day1=-1;
		int day2=-1;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int profit = arr[j] - arr[i];
	            if (profit > maxProfit) {
	                maxProfit = profit;
	                day1=i;
					day2=j;
	            }
			}
		}
		return new int[] {maxProfit,day1,day2};
		
	}
	
	static int[] stockBuyAndSaleOptimizedWithExtraSpace(int arr[]) {
		int maxProfit=0;
		int day1=-1;
		int day2=-1;
		int arr2[]=new int[arr.length];
		int arrIndex2[]=new int[arr.length];
		int k=0;
		arr2[k]=arr[0];
		arrIndex2[k]=0;
		k++;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr2[k-1]) {
				arr2[k]=arr[i];
				arrIndex2[k]=i;
				k++;
			}else {
				arr2[k]=arr2[k-1];
				arrIndex2[k]=arrIndex2[k-1];
				k++;
			}	
		}
		for(int i=0;i<arr.length;i++) {
			
			if((arr[i]-arr2[i])>maxProfit) {
				maxProfit=arr[i]-arr2[i];
				day2=i;
				day1=arrIndex2[i];
			}
		}
		if (maxProfit == 0) {
	        return new int[]{0, -1, -1};
	    }
		return new int[] {maxProfit,day1,day2};
	}
	
	static int[]stockBuyAndSaleOptimizedWithoutExtraSpace(int arr[]){
		int maxProfit=0;
		int day1=0;
		int tempDay1=0;
		int day2=-1;
		int minTillNow=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<minTillNow) {
				minTillNow=arr[i];
				tempDay1=i;
			}
			int profit=arr[i]-minTillNow;
			if(profit>maxProfit) {
				maxProfit=profit;
				day2=i;
				day1=tempDay1;
			}
		}	
		if (maxProfit == 0) {
		    return new int[]{0, -1, -1};
		}

		return new int[] {maxProfit,day1,day2};
	}
	
	public static void main(String args[]) {
		
		//int arr[]=new int[] {7,1,5,3,6,4};
		//int arr[]=new int[] {6,6,4,3,1};
		int arr[]= {2,4,1};
		System.out.println(Arrays.toString(stockBuyAndSaleBruteForce(arr)));
	System.out.println(Arrays.toString(stockBuyAndSaleOptimizedWithoutExtraSpace(arr)));
	}

}