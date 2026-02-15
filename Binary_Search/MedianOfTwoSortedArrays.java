package practise;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MedianOfTwoSortedArrays {
	
	static double medianOfTwoSortedArraysBruteForce(List<Integer> arr1, List<Integer> arr2) {
		int totalLength=arr1.size()+arr2.size();
		if(totalLength%2==1) {
			int i=0;
			int j=0;
			int count=0;
			int mid=(totalLength+1)/2;
			while(i<arr1.size()&&j<arr2.size()) {
				if(arr1.get(i)<arr2.get(j))
				{
					count++;
					if(count==mid)
						return (double)arr1.get(i);
					i++;
				}else if(arr1.get(i)>arr2.get(j)) {
					
					count++;
					if(count==mid)
						return (double)arr2.get(j);
					j++;
				}else {
					
					count++;
					if(count==mid)
						return (double)arr1.get(i);
					count++;
					if(count==mid)
						return (double)arr2.get(j);
					i++;
					j++;
				}
			}
			while(i<arr1.size()) {
				count++;
				if(count==mid)
					return (double)arr1.get(i);
				i++;
			}
			
			while(j<arr2.size()) {
				count++;
				if(count==mid)
					return (double)arr2.get(j);
				j++;
			}
			
		}else {
			int i=0;
			int j=0;
			int count=0;
			double mid1Value=0;
			int mid=totalLength/2+1;
			while(i<arr1.size()&&j<arr2.size()) {
				if(arr1.get(i)<arr2.get(j))
				{
					count++;
					if(count==(totalLength)/2)
						mid1Value=(double)arr1.get(i);
					if(count==mid) {
						double sum=(double)arr1.get(i);
						return (sum+mid1Value)/2;
					}
					i++;
				}else if(arr1.get(i)>arr2.get(j)) {
					
					count++;
					if(count==(totalLength)/2)
						mid1Value=(double)arr2.get(j);
					if(count==mid) {
						double sum=(double)arr2.get(j);
						return (sum+mid1Value)/2;
					}
					j++;
				}else {
					
					count++;
					if(count==(totalLength)/2)
						mid1Value=(double)arr1.get(i);
					if(count==mid) {
						double sum=(double)arr1.get(i);
						return (sum+mid1Value)/2;
					}
					count++;
					if(count==(totalLength)/2)
						mid1Value=(double)arr2.get(j);
					if(count==mid) {
						double sum=(double)arr2.get(j);
						return (sum+mid1Value)/2;
					}
					i++;
					j++;
				}
			}
			while(i<arr1.size()) {
				count++;
				if(count==(totalLength)/2)
					mid1Value=(double)arr1.get(i);
				if(count==mid) {
					double sum=(double)arr1.get(i);
					return (sum+mid1Value)/2;
				}
				i++;
			}
			
			while(j<arr2.size()) {
				count++;
				if(count==(totalLength)/2)
					mid1Value=(double)arr2.get(j);
				if(count==mid) {
					double sum=(double)arr2.get(j);
					return (sum+mid1Value)/2;
				}
				j++;
			}
		}
		return -1;
		
	}
	
	public static String medianOfTwoSortedArraysBinarySearch(List<Integer> nums1, List<Integer> nums2) {
	    int n1=nums1.size();
	    int n2=nums2.size();
	    if(n1>n2)return medianOfTwoSortedArraysBinarySearch(nums2,nums1);
	    int low=0;
	    int high=n1;
	    int left=(n1+n2+1)/2;
	    int n=n1+n2;
	    while(low<=high) {
	    	int mid1=low+(high-low)/2;
	    	int mid2=left-mid1;
	    	int l1=Integer.MIN_VALUE;
	    	int l2=Integer.MIN_VALUE;
	    	int r1=Integer.MAX_VALUE;
	    	int r2=Integer.MAX_VALUE;
	    	if(mid1<n1)r1=nums1.get(mid1);
	    	if(mid2<n2)r2=nums2.get(mid2);
	    	if(mid1-1>=0)l1=nums1.get(mid1-1);
	    	if(mid2-1>=0)l2=nums2.get(mid2-1);
	    	if(l1<=r2&&l2<=r1) {
	    		if(n%2==0)
	    			return String.format(Locale.US, "%.1f",((double)(Math.max(l1, l2)+Math.min(r1, r2)))/2.0);
	    		else
	    			return String.format(Locale.US, "%.1f",(double)(Math.max(l1, l2)));
	    	}else if(l1>r2)
	    		high=mid1-1;
	    	else
	    		low=mid1+1;
	    		
	    	
	    }
	    return "0.0";
	}
	public static void main(String args[]) {
		System.out.println(medianOfTwoSortedArraysBinarySearch(Arrays.asList(2,4),Arrays.asList(3,5)));
		//System.out.println(medianOfTwoSortedArraysBruteForce(Arrays.asList(1, 2, 2),Arrays.asList(2,3)));

	}
	
	

}