class Solution {
    public int strStr(String haystack, String needle) {
        int needleIndex = -1;
        for(int i = 0 ; i < haystack.length(); i++){
            int count = 0;
            for(int j = 0 ; j < needle.length() ; j++){
                if(i + j < haystack.length() && haystack.charAt(i+j) == needle.charAt(j)) {
                    if(j == 0){
                        needleIndex = i;
                    }
                    count++;
                }
            }
            if(count == needle.length()){
                return needleIndex;
            }
        }
        return -1;
    }
}