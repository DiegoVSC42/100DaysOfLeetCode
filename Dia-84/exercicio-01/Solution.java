class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while(i != j){
            int currentHeight = Math.min(height[i],height[j]) ;
            int currentLength = j - i;
            int currentArea = currentHeight * currentLength;
            maxArea = Math.max(maxArea,currentArea);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}