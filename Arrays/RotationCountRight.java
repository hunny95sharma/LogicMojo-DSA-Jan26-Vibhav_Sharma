package practise;

import java.util.Arrays;

public class RotationCountRight {

	static int rotationCountRightBruteForce(int arr[]) {
		int nums[]=new int[arr.length];
		for(int k=0;k<arr.length;k++) {
			nums[k]=arr[k];
		}
		Arrays.sort(nums);
		for(int i=1;i<nums.length;i++) {
			int data=nums[nums.length-1];
			for(int j=nums.length-1;j>0;j--) {
				nums[j]=nums[j-1];
				
			}
			nums[0]=data;
			if(checkTwoArrayIsSame(arr,nums))
				return i;
		}
		return -1;
	}
	
	static boolean checkTwoArrayIsSame(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
		
	}
	
static int rotationCountRightBinarySearchUnique(int arr[]) {
		
		
	int low=0;
	int high=arr.length-1;
	int min=Integer.MAX_VALUE;
	int minIndex=-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(arr[low]<=arr[mid]) {
			if(arr[low]<min) {
				min=arr[low];
				minIndex=low;
			}
				low=mid+1;
			}
			else {
				if(arr[mid]<min) {
					min=arr[mid];
					minIndex=mid;
				}
				high=mid-1;
			}
				
		}
		
	return minIndex;	
	}

static int rotationCountRightBinarySearchDuplicate(int arr[]) {
	
	
	int low=0;
	int high=arr.length-1;
	int min=Integer.MAX_VALUE;
	int minIndex=-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(arr[mid]==arr[low]&&arr[mid]==arr[high]) {
            if(arr[mid]<min) {
            min=arr[mid];
            minIndex=mid;
            }
			low++;
			high--;
		}
		else if(arr[low]<=arr[mid]) {
			if(arr[low]<min) {
				min=arr[low];
				minIndex=low;
			}
				low=mid+1;
			}
			else {
				if(arr[mid]<min) {
					min=arr[mid];
					minIndex=mid;
				}
				high=mid-1;
			}
				
		}
		
	return minIndex;	
	}
	
	
	
	public static void main(String args[]) {
		
		System.out.println(rotationCountRightBinarySearchUnique(new int[] {2,3,4,1}));
		System.out.println(rotationCountRightBinarySearchUnique(new int[] {4,5,6,1,2,3}));
		System.out.println(rotationCountRightBinarySearchUnique(new int[] {2,2,2,0,1,2}));

		
	}
	
	
}