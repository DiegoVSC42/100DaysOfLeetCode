// length of last word
class Solution {
    public int lengthOfLastWord(String s) {
        int wordLength = 0;
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            if(s.charAt(i) != ' '){
                wordLength++;
            }else if(wordLength > 0){
                return wordLength;
            }
        }
        return wordLength;
    }
}

//plus-one

class Solution {
    public int[] plusOne(int[] digits) {
        int count = 0;
        for(int i = 0 ; i <= digits.length-1 ;i++){
            count = digits[i] == 9 ? count + 1 : count;
        }
        if(count == digits.length){
            int[] aux = new int[digits.length+1];
            aux[0] = 1;
            return aux;
        }
        int idx = digits.length-1;
        Boolean isAdded = false;
        while(!isAdded){
            if(digits[idx] == 9){
                digits[idx] = 0;
                idx--;
            }else{
                digits[idx] = digits[idx] + 1;
                isAdded = true;
            }
        }        
        return digits;
    }
}

//Add Binary

class Solution {
    public String addBinary(String a, String b) {
        int target = a.length() > b.length() ? a.length()+1 : b.length()+1;
        while(a.length() < target || b.length() < target) {
            a = a.length() < target ? '0' + a : a;
            b = b.length() < target ? '0' + b : b;
        }
        char[] c = new char[target];
        char carry = '0';
        for(int i = target - 1 ; i >= 0 ; i--){
            int sum = (a.charAt(i) - '0') + (b.charAt(i) - '0') + (carry - '0');
            switch (sum){
                case 0:
                    c[i] = '0';
                    carry = '0';
                    break;
                case 1:
                    c[i] = '1';
                    carry = '0';
                    break;
                case 2:
                    c[i] = '0';
                    carry = '1';
                    break;
                default:
                    c[i] = '1';
                    carry = '1';
                    break;
            }
        }
        int i = 0;
        while(i < c.length -1 && c[i] == '0'){
            i++;
        }
        String result = new String(c,i,c.length-i);
        return result;
    }

}