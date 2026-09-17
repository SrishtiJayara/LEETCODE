class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String arr=words[i];
            if(arr.charAt(0)=='a' ||arr.charAt(0)=='e' ||arr.charAt(0)=='i' ||arr.charAt(0)=='o' ||arr.charAt(0)=='u'){
                if(arr.charAt(arr.length()-1)=='a'|| arr.charAt(arr.length()-1)=='e' ||arr.charAt(arr.length()-1)=='i'|| arr.charAt(arr.length()-1)=='o'|| arr.charAt(arr.length()-1)=='u'){
                count++;
            }
            }
        }
        return count;
    }
}