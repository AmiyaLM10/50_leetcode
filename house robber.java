class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; 
        }
        if (nums.length == 1) {
            return nums[0]; 
        }  
        int h1 = 0, h2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = h1;
            h1 = Math.max(h1, h2 + nums[i]); 
            h2 = temp; 
        }
        return h1;
    }
}
