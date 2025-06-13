class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        int result = 0;
        while(i < j){
            int current = nums[i] + nums[j];
            if(current == k){
                result++;
                i++;
                j--;
            }
            else if(current < k) i++;
            else j--;
        }
        return result;
    }
}