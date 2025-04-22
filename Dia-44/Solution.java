class Solution {
    public void sortColors(int[] nums) {
        int left = 0, 
        int right = nums.length - 1, 
        int idx = 0;
        while(idx <= right){
            if(nums[idx] == 0){
                swap(nums, idx, left);
                left++;
            }
            if(nums[idx] == 2){
                swap(nums, idx, right);
                right--;
            }else{
                idx++;
            }
        }
    }
    public void swap(int[] nums, int a, int b){
        int aux = nums[a];
        nums[a] = nums[b];
        nums[b] = aux;
    } 
}