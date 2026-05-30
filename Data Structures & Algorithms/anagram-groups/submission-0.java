class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>();
        for (String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);

            if (hmap.containsKey(str)) {
                hmap.get(str).add(s);
            } else {
                List<String> alist = new ArrayList<>();
                alist.add(s);
                hmap.put(str, alist);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> list : hmap.values()) {
            result.add(list);
        }

        return result;
    }
}
