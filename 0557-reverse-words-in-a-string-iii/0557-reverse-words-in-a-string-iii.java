class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] d = arr[i].toCharArray();
            int a = 0;
            int b = d.length - 1;
            while (a < b) {
                char temp = d[a];
                d[a] = d[b];
                d[b] = temp;
                a++;
                b--;
            }
            arr[i] = new String(d);
        }
        return String.join(" ", arr);
    }
}