class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = (int)Math.pow(2, n);
        for(int i = 0; i < a; i++) {
            list.add(i ^ (i >> 1));
        }
        return list;
    }
}