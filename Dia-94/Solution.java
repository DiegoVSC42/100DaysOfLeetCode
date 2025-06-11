// Greatest Common Divisor of Strings
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        int sL = str1.length();
        int tL = str2.length();
        while(tL != 0){
            int tmp = tL;
            tL = sL % tL;
            sL = tmp;
        }
        return str2.substring(0,sL);
    }
}
// Find Pivot Index
class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = Arrays.stream(nums).sum();
        for(int i = 0; i < nums.length;i++){
            right = right - nums[i];
            if(left == right) return i;
            left = left + nums[i];
        }
        return -1;
    }
}
// Is Subsequence

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