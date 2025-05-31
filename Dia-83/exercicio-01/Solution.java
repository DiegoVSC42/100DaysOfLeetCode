class Solution {
    Map<Character, String> phoneMap;
    List<String> result;
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        result = new ArrayList<>();
        backTrack(digits,0,new StringBuilder());
        return result;

    }
    public void backTrack(String digits, int index, StringBuilder current){
        if(digits.length() == index){
            result.add(current.toString());
        }else{
            String letters = phoneMap.get(digits.charAt(index));
            for(char letter : letters.toCharArray()){
                current.append(letter);
                backTrack(digits, index + 1, current);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }
}