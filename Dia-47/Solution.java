class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>(); 
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1;i++){
            int target = -nums[i], j = i + 1, k = nums.length-1;
            while(j < k){
                int sum = nums[j] + nums[k];
                if(sum == target){
                    List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                    if(!triplets.contains(triplet))triplets.add(triplet);
                    j++;
                    k--;
                }else if(sum < target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        result.addAll(triplets);
        return result;
    }
}