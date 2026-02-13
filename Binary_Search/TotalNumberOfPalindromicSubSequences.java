package practise;

import java.util.ArrayList;

public class TotalNumberOfPalindromicSubSequences {
	
	static int totalNumberOfPalindromicSubSequencesBruteForce(String s){
		int count=0;
		ArrayList<String>result=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				
				if(isPalindromeCheck(s,i,j)) {
					count++;
					result.add("("+i+","+j+")");
				}
			}
		}
		System.out.println(result);
		return count;
	}
	
	static boolean isPalindromeCheck(String s,int start,int end) {
	
		for(int i=start,j=end;i<=j;i++,j--) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
	
	static int totalNumberOfPalindromicSubSequencesOptimized(String s){
		int count=0;
		ArrayList<String>result=new ArrayList<>();
		for(int center=0;center<s.length();center++) {
			count=count+expandCenter(s,center,center);
			result.add("("+center+","+center+")");
			count=count+expandCenter(s,center,center+1);
			result.add("("+center+","+(center+1)+")");
		}
		System.out.println(result);
		return count;
	}
	
	static int expandCenter(String s,int left,int right) {
		int count=0;
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
			count++;
			left--;
			right++;
		}
		return count;
	}
	
	public static void main(String args[]) {
		
		System.out.println(totalNumberOfPalindromicSubSequencesBruteForce("abc"));
		System.out.println(totalNumberOfPalindromicSubSequencesOptimized("abc"));
		System.out.println(totalNumberOfPalindromicSubSequencesBruteForce("aaa"));
		System.out.println(totalNumberOfPalindromicSubSequencesOptimized("aaa"));
	}

}