public class Problem4 {

    // Input: nums = [-2,1,-3,4,-1,2,1,-5,4] 
    //  Output: 6

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
       
       for(int i =0 ; i<nums.length;i++){
           
           sum += nums[i];
           
           if(sum > max) max = sum;
           
           if(sum < 0 ) sum = 0 ;
           
       }
       
       return max;
   }
    
}

// Given an integer array `nums`, find the subarray with the largest sum, and return its sum.