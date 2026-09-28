class Solution {
    public String clearDigits(String s) {
        StringBuilder arr=new StringBuilder(s);
        for(int i=0;i<arr.length();i++){
            if(Character.isDigit(arr.charAt(i))){
                arr.deleteCharAt(i);
                if(i>0){
                    arr.deleteCharAt(i-1);
                    i=i-2;
                }
            }
        }
        return arr.toString();
    }
}