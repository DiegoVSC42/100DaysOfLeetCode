class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            maxEndingHere = maxEndingHere + nums[i] > nums[i] ? maxEndingHere + nums[i] : nums[i];
            maxSoFar = maxSoFar > maxEndingHere ? maxSoFar : maxEndingHere;
        }
        return maxSoFar;
    }
}