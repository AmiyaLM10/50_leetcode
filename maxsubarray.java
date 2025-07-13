class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];  
        int c_sum = nums[0];  
        for (int i = 1; i < nums.length; i++) {
            c_sum = Math.max(nums[i], c_sum + nums[i]); 
            maxsum = Math.max(maxsum, c_sum);  
        }
        return maxsum;
    }
}
