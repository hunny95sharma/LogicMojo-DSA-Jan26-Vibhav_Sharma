package practise;


public class WaveTraversal {
	
	static void waveTraversalPrintCoulomnByCoulomnTopToBottomLeftSide(int arr[][]) {
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0;i<col;i++) {
			System.out.print("{ ");
			if(i%2==0)
			{
				for(int j=0;j<row;j++) {
					System.out.print(arr[j][i]+", ");
				}
			}else {
				for(int j=row-1;j>=0;j--) {
					System.out.print(arr[j][i]+", ");
				}
			}
			System.out.print(" }");
			System.out.println();
		}
		
		
	}
	
	static void waveTraversalPrintCoulomnByCoulomnBottomToTopLeftSide(int arr[][]) {
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0;i<col;i++) {
			System.out.print("{ ");
			if(i%2==0)
			{
				for(int j=row-1;j>=0;j--) {
					System.out.print(arr[j][i]+", ");
				}
				
			}else {
				for(int j=0;j<row;j++) {
					System.out.print(arr[j][i]+", ");
				}
			}
			System.out.print(" }");
			System.out.println();
		}
		
		
	}
	
	static void waveTraversalPrintCoulomnByCoulomnTopToBottomRightSide(int arr[][]) {
		int row=arr.length;
		int col=arr[0].length;
		for(int i=col-1;i>=0;i--) {
			System.out.print("{ ");
			if(i%2==0)
			{
				for(int j=row-1;j>=0;j--) {
					System.out.print(arr[j][i]+", ");
				}
				
			}else {
				for(int j=0;j<row;j++) {
					System.out.print(arr[j][i]+", ");
				}
			}
			System.out.print(" }");
			System.out.println();
		}
		
		
	}
	
	static void waveTraversalPrintCoulomnByCoulomnBottomToTopRightSide(int arr[][]) {
		int row=arr.length;
		int col=arr[0].length;
		for(int i=col-1;i>=0;i--) {
			System.out.print("{ ");
			if(i%2==0)
			{
				for(int j=0;j<row;j++) {
					System.out.print(arr[j][i]+", ");
				}
				
			}else {
				for(int j=row-1;j>=0;j--) {
					System.out.print(arr[j][i]+", ");
				}
			}
			System.out.print(" }");
			System.out.println();
		}
		
		
	}
	
	static void waveTraversalPrintRowByRowRightToLeftFromRightSideTop(int arr[][]) {
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0;i<row;i++) {
			System.out.print("{ ");
			if(i%2==0)
			{
				for(int j=col-1;j>=0;j--) {
					System.out.print(arr[i][j]+", ");
				}
				
			}else {
				for(int j=0;j<col;j++) {
					System.out.print(arr[i][j]+", ");
				}
			}
			System.out.print(" }");
			System.out.println();
		}
		
		
	}
	
	static void waveTraversalPrintRowByRowRightToLeftFromRightSideBottom(int arr[][]) {
		int row=arr.length;
		int col=arr[0].length;
		for(int i=row-1;i>=0;i--) {
			System.out.print("{ ");
			if(i%2==0)
			{
				for(int j=col-1;j>=0;j--) {
					System.out.print(arr[i][j]+", ");
				}
				
				
			}else {
				for(int j=0;j<col;j++) {
					System.out.print(arr[i][j]+", ");
				}
			}
			System.out.print(" }");
			System.out.println();
		}
		
		
	}
	
	static void waveTraversalPrintRowByRowLeftToRightFromLeftSideTop(int arr[][]) {
		int row=arr.length;
		int col=arr[0].length;
		for(int i=0;i<row;i++) {
			System.out.print("{ ");
			if(i%2==0)
			{
				for(int j=0;j<col;j++) {
					System.out.print(arr[i][j]+", ");
				}
				
			}else {
				for(int j=col-1;j>=0;j--) {
					System.out.print(arr[i][j]+", ");
				}
			}
			System.out.print(" }");
			System.out.println();
		}
		
		
	}
	
	static void waveTraversalPrintRowByRowLeftToRightFromLeftSideBottom(int arr[][]) {
		int row=arr.length;
		int col=arr[0].length;
		for(int i=row-1;i>=0;i--) {
			System.out.print("{ ");
			if(i%2==0)
			{
				for(int j=0;j<col;j++) {
					System.out.print(arr[i][j]+", ");
				}
				
			}else {
				for(int j=col-1;j>=0;j--) {
					System.out.print(arr[i][j]+", ");
				}
			}
			System.out.print(" }");
			System.out.println();
		}
		
		
	}
	

	public static void main(String args[]) {
		waveTraversalPrintCoulomnByCoulomnBottomToTopLeftSide(new int[][] {
		{1,3,5,7},
		{10,11,16,20},
		{23,30,34,60}
		});
		
	}

}