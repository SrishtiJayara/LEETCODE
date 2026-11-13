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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        k = k % count;
        while(k > 0) {
            temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            ListNode last = temp.next;
            temp.next = null;
            last.next = head;
            head = last;
            k--;
        }
        return head;
    }
}