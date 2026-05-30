class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer, Boolean> hmap = new HashMap<>();

        for (int num : nums) {
            if(hmap.containsKey(num)){
                return true;
            }
            hmap.put(num, false);
        }
        return false;
    }

   
}