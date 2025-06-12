// Kids With the Greatest Number of Candies

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

// Unique Number of Occurrences

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

// Guess Number Higher or Lower

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i = 1, j = n;
        while(i <= j){
            int currentGuess = i + (j - i) / 2;
            int guessResponse = guess(currentGuess);
            if(guessResponse == -1){
                j = currentGuess - 1;
            }else if(guessResponse == 1){
                i = currentGuess + 1;
            }else{
                return currentGuess;
            }
        }
        return 42;
    }
}