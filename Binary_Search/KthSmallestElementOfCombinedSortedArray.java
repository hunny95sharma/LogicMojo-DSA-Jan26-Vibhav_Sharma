package practise;

public class KthSmallestElementOfCombinedSortedArray {
	
	
	static int kThSmallestElementOfCombinedSortedArrayOptimized(int arr1[],int arr2[],int target) {
		int m=arr1.length;
		int n=arr2.length;
		 int arr3[]=new int[m+n];
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i<m&&j<n) {
	            if(arr1[i]<arr2[j]) {
	                arr3[k++]=arr1[i];
	                i++;
	            }else if(arr1[i]>arr2[j]) {
	                arr3[k++]=arr2[j];
	                j++;
	            }else {
	                arr3[k++]=arr1[i];
	                i++;
	            }
	            
	        }
	        while(i<m) {
	            arr3[k++]=arr1[i];
	            i++;
	        }
	        while(j<n) {
	            arr3[k++]=arr2[j];
	            j++;
	        }
	        
	        return arr3[target-1];
	}
	
	public static void main(String args[]) {
		
		System.out.println(kThSmallestElementOfCombinedSortedArrayOptimized(new int[] {1000},new int[] {1,2,3,4,5,6,7,8,9,10},4));
		
	}

}