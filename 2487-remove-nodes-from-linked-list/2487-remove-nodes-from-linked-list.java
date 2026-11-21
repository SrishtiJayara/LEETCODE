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
    public ListNode removeNodes(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        int[] arr = new int[count];
        temp = head;
        int j = 0;

        while(temp != null){
            arr[j] = temp.val;
            j++;
            temp = temp.next;
        }

        int[] ans = new int[count];
        int k = 0;
        int max = Integer.MIN_VALUE;

        for(int i = count - 1; i >= 0; i--){
            if(arr[i] >= max){
                ans[k] = arr[i];
                k++;
                max = arr[i];
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int i = k - 1; i >= 0; i--){
            curr.next = new ListNode(ans[i]);
            curr = curr.next;
        }

        return dummy.next;
    }
}

