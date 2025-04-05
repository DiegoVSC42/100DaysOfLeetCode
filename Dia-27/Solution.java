class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int middle = (left + right)/2;
        while(middle != left){
            if(nums[middle+1] < nums[middle]){
                return nums[middle+1];               
            }else if(nums[middle] < nums[middle-1]){
                return nums[middle];
            }else if(nums[right] > nums[middle]){
                right = middle;
            }else{
                left = middle + 1;
            }
            middle = (left + right)/2;
        }
        return Math.min(nums[middle],Math.min(nums[left],nums[right]));
    }
}