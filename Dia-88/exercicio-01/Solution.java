class Solution {
    public int largestAltitude(int[] gain) {
        int[] largestSoFar = new int[gain.length + 1];
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < gain.length ;i++){
            largestSoFar[i + 1] = largestSoFar[i] + gain[i];
            max = Math.max(largestSoFar[i],max);
        }
        return  Math.max(largestSoFar[gain.length],max);
    }
}