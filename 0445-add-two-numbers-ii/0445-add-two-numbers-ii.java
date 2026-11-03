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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder num1=new StringBuilder();
        StringBuilder num2=new StringBuilder();
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null){
            num1.append(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            num2.append(temp2.val);
            temp2=temp2.next;
        }
        BigInteger a=new BigInteger(num1.toString());
        BigInteger b=new BigInteger(num2.toString());
        BigInteger c=a.add(b);
        String s=c.toString();
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int i=0;i<s.length();i++ ){
            int digit=s.charAt(i)-'0';
            curr.next=new ListNode(digit);
            curr=curr.next;
        }
        return dummy.next;
    }
}