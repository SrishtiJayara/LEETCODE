class Solution {
    public int convertTime(String current, String correct) {
        String[] a = current.split(":");
        String[] b = correct.split(":");
        int c = Integer.parseInt(a[0]) * 60 + Integer.parseInt(a[1]);
        int d = Integer.parseInt(b[0]) * 60 + Integer.parseInt(b[1]);
        int diff = d - c;
        int count = 0;
        count += diff / 60;
        diff %= 60;
        count += diff / 15;
        diff %= 15;
        count += diff / 5;
        diff %= 5;
        count += diff;
        return count;
    }
}