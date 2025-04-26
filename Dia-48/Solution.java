class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] small = nums1.length < nums2.length ? nums1 : nums2;
        int[] big =  nums1.length < nums2.length ? nums2 : nums1;
        int i = 0, j = 0;
        Set<Integer> set = new HashSet<>();
        while(i < small.length && j < big.length){
            if(small[i] == big[j]){
                if(!set.contains(small[i]))set.add(small[i]);
                i++;
                j++;
            }else if(big[j] > small[i]){
                i++;
            }else{
                j++;
            }
        }
        int[] result = new int[set.size()];
        int idx = 0;
        for(Integer num : set){
            result[idx] = num;
            idx++;
        }
        return result;
    }
}