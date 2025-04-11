class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        Map<Integer, Character> hexLetters = Map.of(10,'a', 11,'b', 12,'c',13,'d',14,'e',15,'f');
        String hexVal = "";
        char currentChar;
        long val = (num < 0) ? Integer.toUnsignedLong(num) : num;
        while(val > 0){
            int currentSet = 0;
            for(int i = 0 ; i < 4 ; i++){
                currentSet |= (val & 1) << i;
                val >>= 1;
            }
            currentChar = currentSet > 9 ? hexLetters.get(currentSet) : ("" + currentSet).charAt(0);
            hexVal = currentChar + hexVal;
        }
        return hexVal;
    }
}