class Solution {
    public boolean isPalindrome(int x) {
      int aux = x;
      int result = 0 ;
      int digit;
      if(x < 0){
        return false;
      }

      while(aux > 0){
        digit = aux % 10;
        result = result*10 + digit;
        aux /=10;
      }
      if(x == 0){
        return true;
      }
        return x == result;
    }
}