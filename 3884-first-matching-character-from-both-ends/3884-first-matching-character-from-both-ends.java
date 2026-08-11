class Solution {
    public int firstMatchingIndex(String s) {
       int a=0;
       int b=s.length()-1;
       while(a<=b){
        if(s.charAt(a)==s.charAt(b)){
            return a;
        }
        else{
            a++;
            b--;
        }
       } 
       return -1;
    }
}