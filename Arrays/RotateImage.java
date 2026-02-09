package practise;

import java.util.Arrays;

public class RotateImage {
public static void rotateImageClockWiseRectangular(int arr[][]) {
	int row=arr.length;
	int col=arr[0].length;
	int res[][]=new int[col][row];
	int newRow=0;
	for(int i=0;i<col;i++) {
		int newCol=0;
		for(int j=row-1;j>=0;j--) {
			res[newRow][newCol++]=arr[j][i];
		}
		newRow++;
	}
	
	System.out.println(Arrays.deepToString(res));
}
public static void rotateImageAntiClockWiseRectangular(int arr[][]) {
	int row=arr.length;
	int col=arr[0].length;
	int res[][]=new int[col][row];
	int newRow=0;
	for(int i=col-1;i>=0;i--) {
		int newCol=0;
		for(int j=0;j<row;j++) {
			res[newRow][newCol++]=arr[j][i];
		}
		newRow++;
	}
	
	System.out.println(Arrays.deepToString(res));
}

public static void rotateImageClockWiseSquare(int arr[][]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr[i].length;j++) {
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
			
		}
		
	}
	int row=0;
	while(row<arr.length) {
		for(int i=0,j=arr[row].length-1;i<=j;i++,j--) {
			int temp=arr[row][i];
			arr[row][i]=arr[row][j];
			arr[row][j]=temp;
		}
		row++;
	}
	System.out.println(Arrays.deepToString(arr));
}

public static void rotateImageAntiClockWiseSquare(int arr[][]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr[i].length;j++) {
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
			
		}
		
	}
	int col=0;
	while(col<arr.length) {
		for(int i=0,j=arr[col].length-1;i<=j;i++,j--) {
			int temp=arr[i][col];
			arr[i][col]=arr[j][col];
			arr[j][col]=temp;
		}
		col++;
	}
	System.out.println(Arrays.deepToString(arr));
}

public static void main(String args[]) {
	rotateImageAntiClockWiseRectangular(new int[][] {
	{1,3,5,7},
	{10,11,16,20},
	{23,30,34,60}
	});
	rotateImageAntiClockWiseSquare(new int[][] {
		{1,2,3},
		{4,5,6},
		{7,8,9}
		});
	
	rotateImageAntiClockWiseSquare(new int[][] {
		{5,1,9,11},
		{2,4,8,10},
		{13,3,6,7},
		{15,14,12,16}
		});
	
}

}