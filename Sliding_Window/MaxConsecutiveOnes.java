package practise;

import java.util.Arrays;
import java.util.List;

public class MaxConsecutiveOnes {
	
	
	static int[] MaxConsecutiveOnesBruteForce(List<Integer> arr) {

    int maxLength = 0;
    int startIndex = -1;
    int endIndex = -1;

    for (int i = 0; i < arr.size(); i++) {

        for (int j = i; j < arr.size(); j++) {

            if (arr.get(j) == 0)
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

	
static int[] MaxConsecutiveOnesSlidingWindow(List<Integer> arr) {
		
		int maxLength=0;
		int startIndex=-1;
		int endIndex=-1;
		
		int start=0;
		int end=0;
		int count=0;
		while(end<arr.size()) {
			
			if(arr.get(end)==1)
				count++;
			if((end-start+1)!=count) {
				while(arr.get(start)!=0)
				{
					count--;
					start++;
				}
				start++;
			}
			if(count>maxLength) {
				maxLength=count;
				startIndex=start;
				endIndex=end;
				
			}
			end++;
		}
		
		return new int[] {maxLength,startIndex,endIndex};
	}
	
	public static void main(String args[]) {
		
		System.out.println(Arrays.toString(MaxConsecutiveOnesBruteForce(Arrays.asList(1,1,0,1,1,1))));
		System.out.println(Arrays.toString(MaxConsecutiveOnesSlidingWindow(Arrays.asList(1,1,0,1,1,1))));
		
	}

}
