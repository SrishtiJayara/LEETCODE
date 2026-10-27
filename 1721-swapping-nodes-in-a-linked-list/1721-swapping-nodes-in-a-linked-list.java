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
    public ListNode swapNodes(ListNode head, int k) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int[] arr=new int[count];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        int temp1=arr[k-1];
        arr[k-1]=arr[count-k];
        arr[count-k]=temp1;

        ListNode head2 = new ListNode(arr[0]);
        ListNode temp2 = head2;

        for (int j = 1; j < arr.length; j++) {
            temp2.next = new ListNode(arr[j]);
            temp2 = temp2.next;
        }
        return head2;
    }
}