class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= max) {
                    max = arr[j];
                    index = j;
                }
            }
            if (arr[index] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans * 10 + arr[i];
        }
        return ans;
    }
}