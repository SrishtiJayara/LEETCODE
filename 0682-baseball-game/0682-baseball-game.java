class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int a = list.get(list.size() - 1) + 
                        list.get(list.size() - 2);
                list.add(a);
            }
            else if(operations[i].equals("D")){
                int a = list.get(list.size() - 1) * 2;
                list.add(a);
            }
            else if(operations[i].equals("C")){
                list.remove(list.size() - 1);
            }
            else{
                list.add(Integer.parseInt(operations[i]));
            }
        }
        int b = 0;
        for(int i = 0; i < list.size(); i++){
            b = b + list.get(i);
        }
        return b;
    }
}