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