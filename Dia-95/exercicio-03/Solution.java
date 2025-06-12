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