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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        ListNode temp1 = head;
        int i = 0;
        while (temp1 != null) {
            ListNode temp2 = temp1.next;
            while (temp2 != null) {
                if (temp1.val < temp2.val) {
                    arr[i] = temp2.val;
                    break;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
            i++;
        }
        return arr;
    }
}