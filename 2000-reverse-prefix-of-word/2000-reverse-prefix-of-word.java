class Solution {
    public String reversePrefix(String word, char ch) {
        int a=0;
        int b=0;
        char[] arr=word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(arr[i]==ch){
                b=i;
                break;
            }
        }
        while(a<b){
            char temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
        String s=new String(arr);
        return s;
    }
}