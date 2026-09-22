class Solution {
    public boolean isSameAfterReversals(int num) {
        String a=String.valueOf(num);
        if(a.length()==1){
            return true;
        }
        if(a.charAt(a.length()-1)=='0'){
            return false;
        }
        return true;
    }
}