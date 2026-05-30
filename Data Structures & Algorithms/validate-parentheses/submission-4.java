class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
           
            if (!stk.isEmpty() && s.charAt(i) == '(' || s.charAt(i) == '['
            || s.charAt(i) == '{' || s.charAt(i) == '<') {
                stk.push(s.charAt(i));
            } else {
                if (!stk.isEmpty() && s.charAt(i) == ')' && stk.peek() == '(') {
                    stk.pop();
                } else if (!stk.isEmpty() && s.charAt(i) == '}' && stk.peek() == '{') {
                    stk.pop();
                } else if (!stk.isEmpty() && s.charAt(i) == ']' && stk.peek() == '[') {
                    stk.pop();
                } else if (!stk.isEmpty() && s.charAt(i) == '>' && stk.peek() == '<') {
                    stk.pop();
                } else {
                    stk.push(s.charAt(i));
                }
            }
        }

        if (!stk.isEmpty()) {
            return false;
        } 
        return true;
    }
}
