class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(fast < nums.length){
            if(nums[fast] != 0){
                if(slow != fast){
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                }
                slow++;
            }
            fast++;
        }
    }
}