package practise;

import java.util.Arrays;
import java.util.List;

public class TrappingRainWater {
	


	    public static int trappingRainWaterOptimized(List<Integer> hei) {
	    int[]maxRight=new int[hei.size()];
	    int[]maxLeft=new int[hei.size()];
	        int k=0;
	        int unitOfWater=0;
	        for(int i=1;i<hei.size();i++)
	        {
	            if(hei.get(i-1)>maxRight[k])
	                maxRight[++k]=hei.get(i-1);
	                else{
	            
	            maxRight[++k]=maxRight[k-1];
	            }
	        }
	        
	        k=hei.size()-1;
	       for(int i=hei.size()-2;i>=0;i--)
	        {
	            if(hei.get(i+1)>maxLeft[k])
	                maxLeft[--k]=hei.get(i+1);
	                else{
	            
	            maxLeft[--k]=maxLeft[k+1];
	            }
	        }
	        for(int i=0;i<hei.size();i++){
	            int count=0;
	            if(maxLeft[i]<maxRight[i]){
	                count=maxLeft[i]-hei.get(i);
	            }else{
	                count=maxRight[i]-hei.get(i);
	            }
	            if(count>=0)
	            unitOfWater=unitOfWater+count;
	        }
	     return unitOfWater;   
	    }
	    
	    public static int trappingRainWaterBruteForce(List<Integer> hei) {
	    	int totalCount=0;
	    	for(int i=0;i<hei.size()-1;i++) {
	    		int right=0;
	    		int left=0;
	    		int count=0;
	    		for(int j=i+1;j<hei.size();j++) {
	    			
	    			if(hei.get(j)>right)
	    				right=hei.get(j);
	    		}
	    		for(int j=i-1;j>=0;j--) {
	    			if(hei.get(j)>left)
	    				left=hei.get(j);
	    		}
	    		if(right<left) {
	    			count=right-hei.get(i);
	    		}else {
	    			count=left-hei.get(i);
	    		}
	    		if(count>=0)
	    			totalCount=totalCount+count;
	    	}
	    	return totalCount;
	    }

	    public static void main(String[] args) {
	       //System.out.println(trappingRainWaterOptimized(Arrays.asList(0 ,1, 0 ,2 ,1 ,0 ,1 ,3 ,2 ,1 ,2 ,1)));
	       //System.out.println(trappingRainWaterBruteForce(Arrays.asList(0 ,1, 0 ,2 ,1 ,0 ,1 ,3 ,2 ,1 ,2 ,1)));
	    	System.out.println(trappingRainWaterOptimized(Arrays.asList(1, 10,0)));
		    System.out.println(trappingRainWaterBruteForce(Arrays.asList(1, 10,0)));
	    }
}
