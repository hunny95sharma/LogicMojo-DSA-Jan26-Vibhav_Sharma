package practise;

public class StringIsPalindrome {

	public static boolean isPalindrome(String s) {
		
		char[] res=s.toCharArray();
		for(int j=s.length()-1,i=0;j>=i;j--,i++) {
			if(res[j]!=res[i])
				return false;
			
		}
return true;		
	}
	
	public static void main(String args[]) {
		System.out.println(isPalindrome("aba"));
	}
	
}