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
    public ListNode reverseBetween(ListNode head, int left, int right) {
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
            temp=temp.next;
            i++;
        }
        while(left<right){
            int ans=arr[left-1];
            arr[left-1]=arr[right-1];
            arr[right-1]=ans;
            left++;
            right--;
        }
        temp = head;
        int j = 0;
        while(temp != null) {
            temp.val = arr[j];
            temp = temp.next;
            j++;
        }
        return head;
    }
}