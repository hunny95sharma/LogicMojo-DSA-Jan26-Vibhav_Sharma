package practise;

public class FirstUniqueCharacterString {

	public static int firstUniqueCharacterStringOptimized(String s) {
		
		int res[]=new int[26];
		for(int i=0;i<s.length();i++) {
			if(res[s.charAt(i)-'a']==0)
			res[s.charAt(i)-'a']=1;
			else
				res[s.charAt(i)-'a']=res[s.charAt(i)-'a']+1;
		}
		for(int i=0;i<s.length();i++) {
			if(res[s.charAt(i)-'a']==1)
				return i;
		}
		return -1;
	}
	
public static int firstUniqueCharacterStringBruteForce(String s) {
		
		for(int i=0;i<s.length();i++) {
			int j=0;
			for(;j<s.length();j++) {
				if(i!=j&&s.charAt(i)==s.charAt(j))
					break;
			}
			if(j==s.length())
				return i;
			
		}
		return -1;
	}
	
	public static void main(String args[]) {
		System.out.println(firstUniqueCharacterStringOptimized("z"));
		
	}
	
	
}