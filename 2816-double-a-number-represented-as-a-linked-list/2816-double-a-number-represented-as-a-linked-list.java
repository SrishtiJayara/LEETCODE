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
import java.math.BigInteger; 
class Solution {
    public ListNode doubleIt(ListNode head) {
        StringBuilder num=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            num.append(temp.val);
            temp=temp.next;
        }
        BigInteger nums=new BigInteger(num.toString());
        BigInteger a=nums.multiply(BigInteger.valueOf(2));
        String s=a.toString();
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            curr.next=new ListNode(digit);
            curr=curr.next;
        }
        return dummy.next;
    }
}