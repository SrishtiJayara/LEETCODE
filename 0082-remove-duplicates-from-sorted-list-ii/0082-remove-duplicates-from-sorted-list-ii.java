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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp1 = new ListNode(0);
        temp1.next = head;

        ListNode temp = temp1;

        while (temp.next != null && temp.next.next != null) {
            if (temp.next.val == temp.next.next.val) {
                int value = temp.next.val;

                while (temp.next != null && temp.next.val == value) {
                    temp.next = temp.next.next;
                }
            } else {
                temp = temp.next;
            }
        }

        return temp1.next;
    }
}