
class Solution {
    public String addBinary(String a, String b) {
        int target = a.length() > b.length() ? a.length()+1 : b.length()+1;
        while(a.length() < target || b.length() < target) {
            a = a.length() < target ? '0' + a : a;
            b = b.length() < target ? '0' + b : b;
        }
        char[] c = new char[target];
        char carry = '0';
        for(int i = target - 1 ; i >= 0 ; i--){
            int sum = (a.charAt(i) - '0') + (b.charAt(i) - '0') + (carry - '0');
            switch (sum){
                case 0:
                    c[i] = '0';
                    carry = '0';
                    break;
                case 1:
                    c[i] = '1';
                    carry = '0';
                    break;
                case 2:
                    c[i] = '0';
                    carry = '1';
                    break;
                default:
                    c[i] = '1';
                    carry = '1';
                    break;
            }
        }
        int i = 0;
        while(i < c.length -1 && c[i] == '0'){
            i++;
        }
        String result = new String(c,i,c.length-i);
        return result;
    }

}