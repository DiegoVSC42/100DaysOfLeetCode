class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);
        int result = 0;
        int prevValue = 0; 
        for(int i = s.length() - 1; i >= 0 ; i--){
            int currentValue = numbers.get(s.charAt(i));
            if(currentValue < prevValue){
                result -= currentValue;
            }else{
                result += currentValue;
            }
            prevValue = currentValue;
        }   
        return result;
    }
}