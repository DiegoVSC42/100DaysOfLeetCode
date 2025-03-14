class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = new HashMap<>();

        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            if (pairs.containsKey(s.charAt(i))){
                if(stack.empty() || stack.peek() != pairs.get(s.charAt(i))){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}