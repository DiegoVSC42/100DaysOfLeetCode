class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O','U'));
        int i = 0;
        int j = s.length() - 1;
        char[] c = s.toCharArray();
        while (i < j){
            while(!vowels.contains(c[i]) && i < j){
                i++;
            }
            while(!vowels.contains(c[j]) && j > i){
                j--;
            }
            char aux = c[i];
            c[i] = c[j];
            c[j] = aux;
            i++;
            j--;
        }
        return new String(c);
    }
}