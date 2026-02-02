package practise;

import java.util.Arrays;

public class NumArrayHomeWorkQuestion {
	private int nums[];
	
	NumArrayHomeWorkQuestion(int nums[]){
		this.nums=nums;
	}
	static Object[] fetchResult(int nums[],int first[],int second[],int three[]) {
		NumArrayHomeWorkQuestion data=new NumArrayHomeWorkQuestion(nums);
		for(int i=0;i<nums.length;i++) {
			if(i>0)
			nums[i]=nums[i]+nums[i-1];
			else
				nums[i]=nums[i];
		}
		return new Object[] {null,data.sumRangePrefixSum(first,nums),data.sumRangePrefixSum(second,nums),data.sumRangePrefixSum(three,nums)};
	}
	 int sumRangeBruteForce(int val[]) {
		int sum1=0;
		int sum2=0;
		for(int i=0;i<val[0];i++)
			sum1=sum1+nums[i];
		for(int i=0;i<=val[1];i++)  //time-complexity=o(n)
			sum2=sum2+nums[i];
		return sum2-sum1;
		
	}
	 int sumRangePrefixSum(int val[],int prefixSum[]) {
		 if(val[0]-1<0)
			 return prefixSum[val[1]]-0;
		 else
		 return prefixSum[val[1]]-prefixSum[val[0]-1];
		 
	 }
	public static void main(String args[]) {
		Object []result1=fetchResult(new int[]{-2,0,3,-5,2,-1},new int[]{0,2},new int[]{2,5},new int[]{0,5});

			System.out.println(Arrays.toString(result1));
	}

}