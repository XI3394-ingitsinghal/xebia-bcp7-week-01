
public class Main {
	
	
	 public int findLengthOfLCIS(int[] nums) {
	        if(nums.length==1)
	            return 1;
	        int dp[] = new int[nums.length];
	        dp[0] = 1;
	        int maxLIS = 1;
	        for(int i=1;i<nums.length;i++)
	        {
	            int curr = nums[i];
	            int prev = nums[i-1];
	            
	            if(prev<curr)
	                dp[i] = dp[i-1]+1;
	            else
	                dp[i] = 1;
	            
	            if(dp[i]>maxLIS)
	                maxLIS = dp[i];
	        }
	        return maxLIS;
	    }
	 
	 public static void main(String args[]) {
		    Main lis = new Main();
	        int nums[] = {1,3,5,4,7};
	        int result = lis.findLengthOfLCIS(nums);
	        
	        System.out.println(result);
	 }
	}


