class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] frequency = new int[26];
        boolean[] seen = new boolean[26];
        for(char c : s.toCharArray()){
            frequency[c - 'a']++;
        }
        for(char c : s.toCharArray()){
            int index = c - 'a';
            if(!seen[index]){
                while(!stack.empty() && stack.peek() > c && frequency[stack.peek() - 'a'] > 0){
                    seen[stack.pop() - 'a'] = false;
                }
                stack.push(c);
                seen[index] = true;
            }
            frequency[index]--;
        }
        String result = "";
        for (Character ch : stack) {
            result += ch;
        }
        return result;
    }
}