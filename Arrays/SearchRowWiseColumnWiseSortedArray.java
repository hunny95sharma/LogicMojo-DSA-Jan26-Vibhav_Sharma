package practise;

import java.util.Arrays;

public class SearchRowWiseColumnWiseSortedArray {

	
	static int[] searchRowWiseColumnWiseSortedArrayBinarySearch(int arr[][],int target){
		
		for(int i=0;i<arr.length;i++) {
			if(target>=arr[i][0]&&target<=arr[i][arr[i].length-1]){
			int res[]=binarySearch(arr,i,target);
            if(res[1]!=-1)
				return res;
            }
			
		}
		return new int[] {-1,-1};
	}
	
	static int[] binarySearch(int arr[][],int i,int target) {
		
		int start=0;
		int end=arr[i].length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[i][mid]==target)
				return new int[] {i,mid};
			else if(arr[i][mid]>target)
				end=mid-1;
			else
				start=mid+1;
			
		}
		return new int[] {i,-1};
	}
	
	static int[] searchRowWiseColumnWiseSortedArrayOptimizedStairCase(int arr[][],int target){
		int row=0;
		int col=arr[0].length-1;
		while(row<arr.length&&col>=0) {
			if(arr[row][col]==target)
				return new int[] {row,col};
			else if(arr[row][col]>target) {
				col--;
			}else {
				row++;
			}		
		}
		return new int[] {-1,-1};
		
	}
	
	static int[] searchRowWiseColumnWiseSortedArrayConvert2dTo1dApproach(int arr[][],int target){
		int start=0;
		int end=(arr.length *arr[0].length)-1;
		int div=arr[0].length;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid/div][mid%div]==target)
				return new int[] {mid/div,mid%div};
			else if(arr[mid/div][mid%div]>target) {
				end=mid-1;
			}else {
				start=mid+1;
			}			
		}
		return new int[] {-1,-1};
	}
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(searchRowWiseColumnWiseSortedArrayConvert2dTo1dApproach(new int[][] {
		{1,3,5,7},
		{10,11,16,20},
		{23,30,34,60}
		},16)));
		
	}
	
}