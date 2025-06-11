class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        int sChar = 0;
        int tChar = 0;
        int count = 0;
        while(sChar < s.length() && tChar < t.length() ){
            if(s.charAt(sChar) == t.charAt(tChar)){
                count++;
                sChar++;
            }
            tChar++;
        }
        return count == s.length();
    }
}