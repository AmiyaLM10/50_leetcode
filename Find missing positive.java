public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i <= n; i++) {
            if (binarySearch(nums, i) == -1) {
                return i;
            }
        }
        return n + 1;
    }
    
    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;  
            
            if (nums[mid] == target) {
                return mid;  
            } else if (nums[mid] < target) {
                left = mid + 1;  
            } else {
                right = mid - 1;  
            }
        }
        
        return -1;  // Target not found
    }
}
