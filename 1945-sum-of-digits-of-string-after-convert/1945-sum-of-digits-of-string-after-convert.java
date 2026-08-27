class Solution {
    public int getLucky(String s, int k) {
        int b = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int pos = ch - 'a' + 1;
            if(pos >= 10) {
                b = b + pos / 10;
                b = b + pos % 10;
            }
            else {
                b = b + pos;
            }
        }
        while(k > 1) {
            int sum = 0;
            while(b > 0) {
                int digit = b % 10;
                sum = sum + digit;
                b = b / 10;
            }
            b = sum;
            k--;
        }
        return b;
    }
}