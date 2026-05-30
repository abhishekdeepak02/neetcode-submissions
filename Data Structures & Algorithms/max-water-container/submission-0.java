class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length-1;
        int maxWaterTrapped = 0;

        while(left < right) {
            int trappedWater = Math.min(heights[left], heights[right]) * (right - left);
            maxWaterTrapped = Math.max(maxWaterTrapped, trappedWater);
        
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWaterTrapped;
    }
}
