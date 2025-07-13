class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;  // Edge case: empty array
        }
        
        int c = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                c++; 
            }
        }
        
        int n = nums.length;
        int k = n - c; 
        
    
        int index = 0;  
        for (int i = 0; i < n; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[index++] = nums[i]; 
            }
        }
        
        return k;  
    }
}
