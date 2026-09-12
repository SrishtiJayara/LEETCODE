class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> list=new ArrayList<>();
        String[] a=text.split(" ");
        for(int i=0;i<a.length-2;i++){
            if(a[i].equals(first)){
                if(a[i+1].equals(second)){
                    list.add(a[i+2]);
                }
            }
        }
        String[] array = list.toArray(new String[0]);
        return array;
    }
}