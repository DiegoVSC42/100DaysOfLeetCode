class Solution {
    public int missingNumber(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length + 1; i++){
            if(i < nums.length){
                answer ^= nums[i];
            }
            answer ^= i;
        }
        return answer;
    }
}