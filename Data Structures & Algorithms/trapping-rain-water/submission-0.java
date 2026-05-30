class Solution {
    public int trap(int[] height) {

        int len = height.length;
        System.out.println(Arrays.toString(height));

        int[] left = new int[len];
        int[] right = new int[len];
        int res = 0;
        left[0] = height[0];

        for(int i = 1; i < len; i++) {
            left[i] = Math.max(height[i], left[i-1]);
        }
        System.out.println(Arrays.toString(left));
        right[len-1] = height[len-1];
        for(int i = len-2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i+1]);
        }
        System.out.println(Arrays.toString(right));
        for (int i = 0; i < len; i++) {
            res += Math.min(left[i], right[i]) - height[i];
        }

        return res;
        
    }
}
