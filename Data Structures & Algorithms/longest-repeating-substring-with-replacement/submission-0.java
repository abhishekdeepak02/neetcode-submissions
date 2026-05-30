class Solution {

    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int res = Integer.MIN_VALUE;
        int low = 0;
        int maxFreq = 0;

        for (int high = 0; high < s.length(); high++) {
            freq[s.charAt(high) - 'A']++;

            int len = high - low + 1;
            maxFreq = Math.max(maxFreq, freq[s.charAt(high) - 'A']);
            int diff = len - maxFreq;

            if (diff > k) {
                freq[s.charAt(low) - 'A']--;
                low++;
                len = high - low + 1;
                diff = len - maxFreq;
            }

            len = high - low + 1;
            res = Math.max(res, len);
        }
        return res;
         
        
    }
}
