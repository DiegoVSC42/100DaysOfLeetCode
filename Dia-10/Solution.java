class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length;
        int operations = 0;
        for(int i = 0 ; i < len - 2 ; i++){
            if(nums[i] == 0){
                for(int j = 0; j < 3 ; j++){
                    nums[i+j] = (nums[i+j] == 1) ? 0 : 1;
                }
                operations++;
            }
        }
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return (sum != len) ? -1 : operations;
    }
}