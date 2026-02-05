package practise;

import java.util.Arrays;

public class MaximumVowelsSubstring {
	
	static int[] maximumVowelsSubstringBruteForce(String input,int k) {
		
		int maximumResult=0;
		int startIndex=-1;
		int endIndex=-1;
			
			for(int i=0;i<=input.length()-k;i++) {
				
				int max=countVowels(input,i,i+k-1);
				
				if(max>maximumResult) {
					maximumResult=max;
					startIndex=i;
					endIndex=i+k-1;
				}
			}
			
		return new int[] {maximumResult,startIndex,endIndex};
		
	}
	
	static int countVowels(String input,int startIndex,int endIndex) {
		int count=0;
		for(int i=startIndex;i<=endIndex;i++) {
			if(input.charAt(i)=='a'||input.charAt(i)=='A'||input.charAt(i)=='e'||input.charAt(i)=='E'||input.charAt(i)=='i'||input.charAt(i)=='I'||input.charAt(i)=='o'||input.charAt(i)=='O'||input.charAt(i)=='u'||input.charAt(i)=='U')
			{
				count++;
			}
		}
		
		return count;
	}
	
static int[] maximumVowelsSubstringSlidingWindow(String input,int k) {
		
		int maxResult=0;
		int startIndex=-1;
		int endIndex=-1;
		int start=0;
		int i=0;
		int count=0;
		while(i<input.length()) {
			if(input.charAt(i)=='a'||input.charAt(i)=='A'||input.charAt(i)=='e'||input.charAt(i)=='E'||input.charAt(i)=='i'||input.charAt(i)=='I'||input.charAt(i)=='o'||input.charAt(i)=='O'||input.charAt(i)=='u'||input.charAt(i)=='U')
			{
				count++;
			}
			if(k==(i-start+1)) {
				
				if(count>maxResult) {
					maxResult=count;
					startIndex=start;
					endIndex=i;
				}
				if(input.charAt(start)=='a'||input.charAt(start)=='A'||input.charAt(start)=='e'||input.charAt(start)=='E'||input.charAt(start)=='i'||input.charAt(start)=='I'||input.charAt(start)=='o'||input.charAt(start)=='O'||input.charAt(start)=='u'||input.charAt(start)=='U')
				{
					count--;
				}
				start++;
			}
			i++;
		}
		return new int[] {maxResult,startIndex,endIndex};
		
	}
	
	
	public static void main(String args[]) {
		System.out.println(Arrays.toString(maximumVowelsSubstringBruteForce("abciiidef",3)));
		System.out.println(Arrays.toString(maximumVowelsSubstringBruteForce("aeiou",2)));
		System.out.println(Arrays.toString(maximumVowelsSubstringBruteForce("weallloveyou",7)));
		System.out.println(Arrays.toString(maximumVowelsSubstringSlidingWindow("abciiidef",3)));
		System.out.println(Arrays.toString(maximumVowelsSubstringSlidingWindow("aeiou",2)));
		System.out.println(Arrays.toString(maximumVowelsSubstringSlidingWindow("weallloveyou",7)));
	}

}
