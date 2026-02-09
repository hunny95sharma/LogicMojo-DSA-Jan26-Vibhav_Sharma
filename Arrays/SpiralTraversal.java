package practise;

public class SpiralTraversal {
	
	
	static void spiralTraversalApproach(int arr[][]) {
		int top=0;
		int left=0;
		int right=arr[0].length-1;
		int bottom=arr.length-1;
		int dir=0;
		while(top<=bottom && left<=right) {
			if(dir==0) {
				for(int i=left;i<=right;i++)
					System.out.print(arr[top][i]+",");
				top++;
				dir++;
			}
			else if(dir==1) {
				
				for(int i=top;i<=bottom;i++)
					System.out.print(arr[i][right]+",");
				right--;
				dir++;
			}
			else if(dir==2) {
				for(int i=right;i>=left;i--)
					System.out.print(arr[bottom][i]+",");
				bottom--;
				dir++;
				
			}
			else {
				for(int i=bottom;i>=top;i--)
					System.out.print(arr[i][left]+",");
				left++;
				dir++;
				
			}
			
			dir=dir%4;
		}
	}
	
	public static void main(String args[]) {
		spiralTraversalApproach(new int[][] {
		{1,3,5,7},
		{10,11,16,20},
		{23,30,34,60}
		});
		/*spiralTraversalApproach(new int[][] {
			{5,1,9,11},
			{2,4,8,10},
			{13,3,6,7},
			{15,14,12,16}
			});*/
	}

}