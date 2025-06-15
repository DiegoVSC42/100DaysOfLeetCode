//Increasing Triplet Subsequence

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <= i)
                i = num;
            else if (num <= j)
                j = num;
            else
                return true;
        }
        return false;
    }
}

// String Compression

class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                sb.append(chars[i - 1]);
                if (count > 1) sb.append(count);
                count = 1;
            }
        }
        
        sb.append(chars[chars.length - 1]);
        if (count > 1) sb.append(count);
        
        char[] compressed = sb.toString().toCharArray();
        System.arraycopy(compressed, 0, chars, 0, compressed.length);
        
        return compressed.length; 
    }
}