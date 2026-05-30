class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int right = 0;
        int maxLength = 0;

        Map<Character, Integer> cmap = new HashMap<>();
        int length = 0;
        while (right < s.length()) {
            if (!cmap.containsKey(s.charAt(right))) {
                cmap.put(s.charAt(right), right);                
                
            } else {
                left = Math.max(left, cmap.get(s.charAt(right)) + 1);
                cmap.replace(s.charAt(right), right);
            }
            length = right - left + 1;
            maxLength = length > maxLength ? length : maxLength;
            right++;
        }
        return maxLength;
    }
}
