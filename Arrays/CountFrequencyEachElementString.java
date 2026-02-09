package practise;


public class CountFrequencyEachElementString {
	
	public static void printFrequencyEachElementString(String s) {
		int res[]=new int[25];
		for(int i=0;i<s.length();i++) {
			if(res[s.charAt(i)-'a']==0)
			res[s.charAt(i)-'a']=1;
			else
				res[s.charAt(i)-'a']=res[s.charAt(i)-'a']+1;
		}
		
		for(int i=0;i<res.length;i++) {
			if(res[i]!=0) {
			char ch=(char)('a'+i);
			System.out.println(ch+"---->"+res[i]+"times");
			}
		}
		
	}
	
	public static void main(String args[]) {
		
		printFrequencyEachElementString("doda");
		
	}

}