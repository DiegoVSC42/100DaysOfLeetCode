class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];

        for(int i = 1 ; i < candies.length; i++){
            max = candies[i] > max ? candies[i] : max;
        }

        for(int candy : candies){
            list.add((candy + extraCandies) >= max );
        }
        return list;
    }
}