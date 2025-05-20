class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        int i = 0;
        int wordLength = 0;
        String word;
        while(i < path.length()){
            if(path.charAt(i) == '/'){
                i++;
            }else{
                wordLength = 0;
                while ((i + wordLength) < path.length() && path.charAt(i + wordLength) != '/') {
                    wordLength++;
                }
                word = path.substring(i,i + wordLength);
                if(word.equals("..")){
                    if (!stack.empty()) 
                        stack.pop();
                }else if (!word.equals(".") && !word.isEmpty()) 
                    stack.push(word);
                i += wordLength;
            }
        }
        word = "";
        for(String dir : stack){
            word = word + '/' + dir;
        }
        return word.length() == 0 ? "/" : word;
    }
}