package practise;

public class MaxOfArray {
	
	static int[] maxOfArray(int arr[]) {
		 if (arr == null || arr.length == 0) {
		        throw new IllegalArgumentException("Array must not be null or empty");
		    }

		    int max = arr[0];
		    int index = 0;

		    for (int i = 1; i < arr.length; i++) {
		        if (arr[i] > max) {
		            max = arr[i];
		            index = i;
		        }
		    }
		    return new int[]{max, index};
	}
	
	static int[] secondMaxOfArray(int arr[]) {
		 if (arr == null || arr.length < 2) {
		        throw new IllegalArgumentException("Array must contain at least two elements");
		    }
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		int maxIndex=-1;
		int secondMaxIndex=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				secondMaxIndex=maxIndex;
				max=arr[i];
				maxIndex=i;
			}
			else
			{
				if(arr[i]>secondMax && arr[i]<max)
				{
					secondMax=arr[i];
					secondMaxIndex=i;
				}
			}
		}
		if (secondMaxIndex == -1) {
	        throw new IllegalArgumentException("No distinct second maximum exists");
	    }

		return new int[] {max,maxIndex,secondMax,secondMaxIndex};
	}

	public static void main(String args[]) {
		int arr[]=new int[] {1,4};
		//int result[]=maxOfArray(arr);
		int result[]=secondMaxOfArray(arr);
		System.out.println("maximum value is=="+result[0]+"at index=="+result[1]);
		System.out.println("second maximum value is=="+result[2]+"at index=="+result[3]);
	}
	
}