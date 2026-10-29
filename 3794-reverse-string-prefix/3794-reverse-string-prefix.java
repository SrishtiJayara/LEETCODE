class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder a=new StringBuilder(s.substring(0,k));
        a.reverse();
        return a.toString()+ s.substring(k);
    }
}