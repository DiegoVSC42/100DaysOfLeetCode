class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> occurrences = new HashMap<>();
        Set<Integer> countUniques = new HashSet<>();
        for(Integer n : arr){
            occurrences.merge(n,1,Integer::sum);
        }

        for (int freq : occurrences.values()) {
            if(!countUniques.add(freq)) return false;
        }
        
        return true;
    }
}