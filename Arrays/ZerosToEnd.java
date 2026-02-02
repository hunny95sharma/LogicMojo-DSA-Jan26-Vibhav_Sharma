package practise;

import java.util.Arrays;

public class ZerosToEnd {
	
	static void zerosToEndWithRelativePositionChangeWithOutExtraSpace(int arr[])
	{
		for(int i=0,j=arr.length-1;i<j;)
		{
			if(arr[i]!=0)
			{
				i++;
			}
			else {
				swap(arr,i,j);
				j--;
			}
		}
	}
	
	static int[] zerosToEndWithOutRelativePositionChangeWithExtraSpace(int arr[])
	{
		int result[]=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				result[k++]=arr[i];
			}
			
		}
		return result;
	}
	
	static void zerosToEndWithOutRelativePositionChangedWithOutExtraSpace(int arr[])
	{
		int i=0,j=0;
		while(j<arr.length) {
			if(arr[j]!=0)
			{
				swap(arr,i,j);
				i++;
				j++;
			}
			else {
				j++;
			}
		}
	}
	static void swap(int arr[],int i,int j) {
		int k;
		k=arr[i];
		arr[i]=arr[j];
		arr[j]=k;
	}
	
	public static void main(String args[]) {
		int arr[]= {0,0,1,0,2};
		//int arr[]= {0,1,0,3,12};
		//int arr[]= {0};
		//int result[]=zerosToEndWithOutPositionChangeWithExtraSpace(arr);
		System.out.println(Arrays.toString(arr));

}
}