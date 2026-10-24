/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder a=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            int b=temp.val;
            a.append(b);
            temp=temp.next;
        }
        String arr=a.toString();
        int ans=Integer.parseInt(arr,2);
        return ans;
    }
}