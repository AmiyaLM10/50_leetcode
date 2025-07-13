class Solution(object):
    def twoSum(self, nums, target):
        num_dict = {}  
        for i, num in enumerate(nums):
            c = target - num
            if c in num_dict:
                return [num_dict[c], i]
            num_dict[num] = i
