class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);
        answer.get(0).addAll(new ArrayList<>(set1));
        answer.get(0).removeAll(set2);
        answer.get(1).addAll(new ArrayList<>(set2));
        answer.get(1).removeAll(set1);
        
        return answer;
    }
}