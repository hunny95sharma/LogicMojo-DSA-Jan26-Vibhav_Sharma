package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNonRepeating {
	
	
	static int[] longestSubstringNonRepeatingBruteForce(String input) {
		int maxLength=0;
		int startIndex=-1;
		int endIndex=-1;
		for(int k=1;k<=input.length();k++) {
			for(int i=0;i<=input.length()-k;i++) {
				int max=nonRepeatingSubstring(input,i,i+k-1);
				if(max>maxLength) {
					maxLength=max;
					startIndex=i;
					endIndex=i+k-1;
				}
			}
		}
		return new int[] {maxLength,startIndex,endIndex};
	}
	
	static int nonRepeatingSubstring(String input,int startIndex,int endIndex) {
		
		for(int i=startIndex;i<=endIndex;i++) {
			for(int j=i+1;j<=endIndex;j++) {
				if(input.charAt(i)==input.charAt(j))
					return -1;
			}
		}
		
		return (endIndex-startIndex+1);
	}
	
	static int[] longestSubstringNonRepeatingSlidingWindow(String input) {
		int start=0;
		int startIndex=-1;
		int endIndex=-1;
		int maxLength=0;
		Set<Character>set=new HashSet<>();
		
		for (int end = 0; end < input.length(); end++) {
	        char c = input.charAt(end);
	        set.add(c);
	        if(set.size()!=(end-start+1)) {
	        while (input.charAt(start)!=input.charAt(end)) {
	            set.remove(input.charAt(start));
	            start++;
	        }
	        start++;
	        }
	        if (end - start + 1 > maxLength) {
	            maxLength = end - start + 1;
	            startIndex = start;
	            endIndex=end;
	        }
	    }
		return new int[] {maxLength,startIndex,endIndex};
	}
	
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(longestSubstringNonRepeatingBruteForce("abcabcbb")));
		System.out.println(Arrays.toString(longestSubstringNonRepeatingSlidingWindow("abcabcbb")));
		System.out.println(Arrays.toString(longestSubstringNonRepeatingBruteForce("bbbb")));
		System.out.println(Arrays.toString(longestSubstringNonRepeatingSlidingWindow("bbbb")));
		System.out.println(Arrays.toString(longestSubstringNonRepeatingBruteForce("pwwkew")));
		System.out.println(Arrays.toString(longestSubstringNonRepeatingSlidingWindow("pwwkew")));
		System.out.println(Arrays.toString(longestSubstringNonRepeatingSlidingWindow("abba")));

	}

}