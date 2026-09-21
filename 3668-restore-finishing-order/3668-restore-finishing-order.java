class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr=new int[friends.length];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<friends.length;i++){
            set.add(friends[i]);
        }
        int a=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                arr[a]=order[i];
                a++;
            }
        }
        return arr;
    }
}