class Solution {
    public boolean isAnagram(String s, String t) {
       
       s = sortString(s);
       t = sortString(t);

       if (s.equals(t)) {
        return true;
       }
       return false;
      
    }

    public String sortString(String s) {
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        String strS = new String(sChar);
        return strS;
    }

   


}
