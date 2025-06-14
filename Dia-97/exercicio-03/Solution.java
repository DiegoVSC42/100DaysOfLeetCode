class Solution {
    public String reverseWords(String s) {
        StringBuilder currentWord = new StringBuilder();
        List<String> words = new ArrayList<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != ' '){
                currentWord.append(s.charAt(i));
            } else {
                if(currentWord.length() > 0){
                    words.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        StringBuilder result = new StringBuilder();

        for (int i = words.size() - 1; i >= 0; i--) {
            result.append(words.get(i));
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
