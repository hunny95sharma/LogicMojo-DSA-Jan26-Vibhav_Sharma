package practise;

import java.util.Arrays;

public class LongestSubstringWithCharacterRiplacement {

	static int[]longestSubstringWithCharacterRiplacementBruteForce(String s,int target){
		int maxLength=0;
		int startIndex=-1;
		int endIndex=-1;
			for(int i=0;i<s.length();i++) {
				int max=0;
				int freqArray[]=new int[26];
				for(int j=i;j<s.length();j++) {
					freqArray[s.charAt(j)-'A']=freqArray[s.charAt(j)-'A']+1;
					if(freqArray[s.charAt(j)-'A']>=1 && freqArray[s.charAt(j)-'A']>=max) {
						max=freqArray[s.charAt(j)-'A'];
					}
                    int count=j-i+1-max;
				if(count<=target && (j-i+1)>=maxLength)
				{
					maxLength=j-i+1;
					startIndex=i;
					endIndex=j;

				}
				}
				
				
			}
		return new int [] {maxLength,startIndex,endIndex};
	}
	
	static int[]longestSubstringWithCharacterRiplacementSlidingWindow(String s,int target){
		int maxLength=0;
		int startIndex=-1;
		int endIndex=-1;
		int start=0;
		int end=0;
		int freqArray[]=new int[26];
		int count=0;
		while(end<s.length()) {
			char ch=s.charAt(end);
			freqArray[ch-'A']=freqArray[ch-'A']+1;
			if(freqArray[ch-'A']>count)
				count=freqArray[ch-'A'];
			
			while((end-start+1-count)>target) {
				freqArray[s.charAt(start)-'A']=freqArray[s.charAt(start)-'A']-1;
				start++;
			}
			if((end-start+1)>maxLength) {
				maxLength=end-start+1;
				startIndex=start;
				endIndex=end;
			}
			end++;
		}
		return new int [] {maxLength,startIndex,endIndex};
	}
	
	
	
	public static void main(String args[]) {
		
		System.out.println(Arrays.toString(longestSubstringWithCharacterRiplacementBruteForce("ABAB",2)));	
		System.out.println(Arrays.toString(longestSubstringWithCharacterRiplacementSlidingWindow("ABAB",2)));	
		System.out.println(Arrays.toString(longestSubstringWithCharacterRiplacementBruteForce("AABABBA",1)));	
		System.out.println(Arrays.toString(longestSubstringWithCharacterRiplacementSlidingWindow("AABABBA",1)));	
		System.out.println(Arrays.toString(longestSubstringWithCharacterRiplacementBruteForce("ABAA",0)));	
		System.out.println(Arrays.toString(longestSubstringWithCharacterRiplacementSlidingWindow("ABAA",0)));	
	}
	
}