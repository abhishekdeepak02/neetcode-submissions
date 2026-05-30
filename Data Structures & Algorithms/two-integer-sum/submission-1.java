class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

       while (i != j) {
        if (i < j) {
            int k = nums[i] + nums[j];
            if (k == target) {
                return new int[]{i, j};
            }
            j--;
        } 
        if (i == j) {
            i = i+1;
            j = nums.length - 1;
        }

        
       }
       return new int[]{-1, -1};
        
    }
}
