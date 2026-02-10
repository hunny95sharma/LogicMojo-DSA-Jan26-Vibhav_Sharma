package practise;

public class ReverseWordInAString {
	
	public static void reverseWordInAStringOptimized(String s) {
		StringBuilder sb=new StringBuilder(s);
		int i=0;
		int start=0;
		int end=0;
		int n=s.length();
		reversePortionOfString(sb,0,n-1);
		while(i<n) {
			while(i<n&&sb.charAt(i)!=' ') {
				sb.setCharAt(end, sb.charAt(i));
				i++;
				end++;
			}
			if(start<end) {
				reversePortionOfString(sb,start,end-1);
				if(end<n)
				sb.setCharAt(end, ' ');
			    end++;
			    start=end;
			}
			i++;
		}
		System.out.println(sb.substring(0,start-1));

	}
	
	 static void reversePortionOfString(StringBuilder s,int start,int end) {
		
		while(start<=end) {
			char temp=s.charAt(end);
			s.setCharAt(end, s.charAt(start));
			s.setCharAt(start, temp);
			start++;
			end--;
		}
	}
	
	public static void main(String args[]) {
		reverseWordInAStringOptimized("   hello   world   ");
		reverseWordInAStringOptimized("the sky is blue");
		reverseWordInAStringOptimized("a good   example");
		
	}

}