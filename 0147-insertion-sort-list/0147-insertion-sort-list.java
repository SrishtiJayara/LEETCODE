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
    public ListNode insertionSortList(ListNode head) {
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
        Arrays.sort(arr);

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int j=0;j<i;j++){
            curr.next=new ListNode(arr[j]);
            curr=curr.next;
        }
        return dummy.next;
    }
}