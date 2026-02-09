package practise;

public class TwoDArrayPrint {

	public static void twoDNormalArrayPrintRowWise(int arr[][]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("{");	
			for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+",");	
			}
			System.out.print("}");	
			System.out.println();	
		}
		
		
	}
public static void twoDNormalArrayPrintCoulomnWise(int arr[][]) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("{");	
			for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[j][i]+",");	
			}
			System.out.print("}");	
			System.out.println();	
		}
		
		
	}

public static void twoDNormalArrayPrintReverseRowWise(int arr[][]) {
	
	for(int i=0;i<arr.length;i++) {
		System.out.print("{");	
		for(int j=arr.length-1;j>=0;j--) {
		System.out.print(arr[i][j]+",");	
		}
		System.out.print("}");	
		System.out.println();	
	}
	
	
}

public static void twoDNormalArrayPrintReverseCoulomnWise(int arr[][]) {
	
	for(int i=0;i<arr.length;i++) {
		System.out.print("{");	
		for(int j=arr.length-1;j>=0;j--) {
		System.out.print(arr[j][i]+",");	
		}
		System.out.print("}");	
		System.out.println();	
	}
	
	
}

public static void twoDJagedArrayPrintRowWise(int arr[][]) {
	
	for(int i=0;i<arr.length;i++) {
		System.out.print("{");	
		for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+",");	
		}
		System.out.print("}");	
		System.out.println();	
	}
	
	
}
public static void twoDJaggedArrayPrintCoulomnWise(int arr[][]) {
	
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i].length>max)
			max=arr[i].length;
		
	}
	
	for(int col=0;col<max;col++) {
		System.out.print("{");	
		for(int j=0;j<arr.length;j++) {
			if(col<arr[j].length)
		System.out.print(arr[j][col]+",");	
		}
		System.out.print("}");	
		System.out.println();	
	}
	
	
}

public static void twoDJaggedArrayPrintReverseRowWise(int arr[][]) {

for(int i=0;i<arr.length;i++) {
	System.out.print("{");	
	for(int j=arr[i].length-1;j>=0;j--) {
	System.out.print(arr[i][j]+",");	
	}
	System.out.print("}");	
	System.out.println();	
}


}

public static void twoDJaggedArrayPrintReverseCoulomnWise(int arr[][]) {

	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i].length>max)
			max=arr[i].length;
		
	}
	
	
for(int col=0;col<max;col++) {
	System.out.print("{");	
	for(int row=arr.length-1;row>=0;row--) {
		if(col<arr[row].length)
	System.out.print(arr[row][col]+",");	
	}
	System.out.print("}");	
	System.out.println();	
}


}
	
	public static void main(String args[]) {
		
		int arr[][]= {
				{1,2},
				{5,6,7},
				{9,10,11,12},
				{13,14,15,16,17}
		};
		twoDJaggedArrayPrintReverseCoulomnWise(arr);
	}
	
	
}