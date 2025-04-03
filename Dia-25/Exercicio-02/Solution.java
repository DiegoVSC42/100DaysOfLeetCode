class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];
        leftProd[0] = nums[0];
        rightProd[nums.length-1] = nums[nums.length-1];
        for(int i = 1 ; i < nums.length ;i ++){
            leftProd[i] = leftProd[i-1] * nums[i];
            
        }
        for(int i = nums.length - 2 ; i >= 0 ; i --){
            rightProd[i] = rightProd[i+1] * nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++){
            if (i == 0){
                answer[i] = rightProd[i+1];
            }else if(i == nums.length-1){
                answer[i] = leftProd[i-1];
            }else{
                answer[i] = leftProd[i-1] * rightProd[i+1];
            }
        }
        return answer;
    }
}