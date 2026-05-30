class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        int rem = str.length()%2;
        int mid = str.length()/2;
        int left = 0;
        int right = str.length() - 1;

        if (rem != 0) {
            mid = str.length()/2 + 1;
        }
        while(left < mid) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }

        }
        return true;
    }
}
