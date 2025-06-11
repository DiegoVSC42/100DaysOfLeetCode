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