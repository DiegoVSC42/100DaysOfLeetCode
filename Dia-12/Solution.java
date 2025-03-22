class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != val){
                queue.add(nums[i]);
                result++;
            }
        }
        for(int i = 0 ; i < result ; i++){
            nums[i] = queue.remove();
        }
        return result;
    }
}