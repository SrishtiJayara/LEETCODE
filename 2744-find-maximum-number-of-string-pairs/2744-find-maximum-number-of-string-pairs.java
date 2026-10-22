class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                StringBuilder sb = new StringBuilder(words[j]);
                sb.reverse();
                if (words[i].equals(sb.toString())) {
                    count++;
                }
            }
        }
        return count;
    }
}