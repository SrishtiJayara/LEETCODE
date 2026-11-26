class Solution {
    public boolean canAliceWin(int n) {
        int a = 10;
        int i = 0;
        while(n >= a) {
            n = n - a;
            a--;
            i++;
        }
        return i % 2 != 0;
    }
}