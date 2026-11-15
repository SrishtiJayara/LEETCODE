class Solution {
    public int maxDistance(int[] colors) {
        int i = 0;
        int j = colors.length - 1;

        while(colors[i] == colors[j]) {
            i++;
        }

        int a = j - i;

        i = 0;
        j = colors.length - 1;

        while(colors[i] == colors[j]) {
            j--;
        }

        int b = j - i;

        return Math.max(a, b);
    }
}