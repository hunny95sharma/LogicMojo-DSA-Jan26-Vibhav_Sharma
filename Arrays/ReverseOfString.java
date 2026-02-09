package practise;


public class ReverseOfString {
	
	public static String reverseOfStringApproach1(String s) {
		
		String res="";
		for(int i=s.length()-1;i>=0;i--)
			res=res+s.charAt(i);
		return res;
		
	}
	
public static String reverseOfStringApproach2(String s) {
		
		StringBuilder res=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
			res.append(s.charAt(i));
		return res.toString();
		
	}

public static String reverseOfStringApproach3(String s) {
	
	char[] res=s.toCharArray();
	for(int j=s.length()-1,i=0;j>=i;j--,i++) {
		char temp=res[j];
		res[j]=res[i];
		res[i]=temp;
		
	}
	return new String(res);
	
}
	
	public static void main(String args[]) {
		
		System.out.println(reverseOfStringApproach3("hell"));
	}

}