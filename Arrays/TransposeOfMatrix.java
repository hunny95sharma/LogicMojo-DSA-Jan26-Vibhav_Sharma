package practise;

import java.util.Arrays;

public class TransposeOfMatrix {

	static void transposeOfMatrixNormalArray(int arr[][]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr[i].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				
			}
			
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
	static void transposeOfMatrixJaggedArray(int arr[][]) {
		int res[][]=new int[arr[0].length][arr.length];
		int newCol=0;
		for(int i=0;i<arr.length;i++) {
			int newRow=0;
			for(int j=0;j<arr[i].length;j++) {
				res[newRow++][newCol]=arr[i][j];
			}
			newCol++;
		}
		
		System.out.println(Arrays.deepToString(res));
	}
	
	public static void main(String args[]) {
		
		transposeOfMatrixJaggedArray(new int[][] {
		{1,2,3},
		{5,6,7},
		{9,10,11},
		{12,13,14}
		});
	}
	
	
	
	
	
}