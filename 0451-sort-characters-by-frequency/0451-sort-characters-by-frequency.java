class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[128];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        StringBuilder a = new StringBuilder();
        while(a.length()<s.length()){
            int max=0;
            char ch=0;
            for(int i=0;i<128;i++){
                if(arr[i]>max){
                    max=arr[i];
                    ch=(char)i;
                }
            }
            for(int i=0;i<max;i++){
                a.append(ch);
            }
            arr[ch]=0;
        }
        return a.toString();
    }
}