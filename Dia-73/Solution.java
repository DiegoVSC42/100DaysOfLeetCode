class Solution {
    public int evalRPN(String[] tokens) {
        Set<Character> operators = Set.of('+', '-', '*', '/');
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < tokens.length;i++){
            if(!operators.contains(tokens[i].charAt(tokens[i].length() - 1))){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int b = stack.pop();
                int a = stack.pop();
                stack.push(operations(a,b,tokens[i].charAt(0)));
            }
        }
        return stack.pop();
    }
    public int operations(int a, int b, char op){
        if(op == '+') return a + b;
        if(op == '-') return a - b;
        if(op == '*') return a * b;
        if(op == '/') return a / b;
        return 0;
    }
}