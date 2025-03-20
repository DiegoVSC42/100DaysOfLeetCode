class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums1.length ; i++){
            map.put(nums1[i][0],nums1[i][1]);
        }
        for(int i = 0 ; i < nums2.length ; i++){
            map.put(nums2[i][0],map.containsKey(nums2[i][0]) ? map.get(nums2[i][0]) + nums2[i][1] : nums2[i][1]);
        }
        int idx = 0;
        int[][] result = new int[map.size()][2];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            result[idx][0] = entry.getKey();
            result[idx][1] = entry.getValue();
            idx++;
        }
        Arrays.sort(result,Comparator.comparingInt(a -> a[0]));
        return result;
    }
}