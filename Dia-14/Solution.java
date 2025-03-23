class Solution {
    public int scoreOfString(String s) {
        int res = 0;
        for(int i = 0 ; i < s.length()-1 ; i++){
            int a = (int) s.charAt(i);
            int b = (int) s.charAt(i+1);
            res = res + ((a-b) < 0 ? -(a-b) : (a-b));
        }
        return res;
    }
}