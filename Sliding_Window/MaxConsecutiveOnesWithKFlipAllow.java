package practise;

import java.util.Arrays;

public class MaxConsecutiveOnesWithKFlipAllow {
	
	
	static int[] MaxConsecutiveOnesWithKFlipAllowBruteForce(int nums[], int target) {

    int maxLength = 0;
    int startIndex = -1;
    int endIndex = -1;

    for (int i = 0; i < nums.length; i++) {
        int zeroCount = 0;

        for (int j = i; j < nums.length; j++) {

            if (nums[j] == 0)
                zeroCount++;

            if (zeroCount > target)
                break;

            if ((j - i + 1) > maxLength) {
                maxLength = j - i + 1;
                startIndex = i;
                endIndex = j;
            }
        }
    }

    return new int[] { maxLength, startIndex, endIndex };
}
	
	static int[] MaxConsecutiveOnesWithKFlipAllowOptimised(int nums[],int target) {

		int maxLength=0;
		int startIndex=-1;
		int endIndex=-1;
        int start=0;
        int end=0;
        int count=0;
        while(end<nums.length) {
        	if(nums[end]==0)
        		count++;
        	while(count>target) {
        		
        		if(nums[start]==0)
        			count--;
        		start++;
        	}
        	if(count<=target) {
        		if((end-start+1)>maxLength) {
        			maxLength=end-start+1;
        			startIndex=start;
        			endIndex=end;
        		}
        	}
        	
        	end++;
        }


		return new int[] {maxLength,startIndex,endIndex};

	}
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(MaxConsecutiveOnesWithKFlipAllowBruteForce(new int[] {1,1,1,0,0,0,1,1,1,1,0},2)));
		System.out.println(Arrays.toString(MaxConsecutiveOnesWithKFlipAllowBruteForce(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1},3)));
		System.out.println(Arrays.toString(MaxConsecutiveOnesWithKFlipAllowOptimised(new int[] {1,1,1,0,0,0,1,1,1,1,0},2)));
		System.out.println(Arrays.toString(MaxConsecutiveOnesWithKFlipAllowOptimised(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1},3)));
	}

}
