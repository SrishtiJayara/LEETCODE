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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int[] arr=new int[count];
        int a=0;
        while(temp!=null){
            arr[a]=temp.val;
            a++;
            temp=temp.next;
        }
        int i=0;
        int j=count-1;
        temp=head;
        while(i<=j){
            if(i==j){
                temp.val=arr[i];
                break;
            }
            temp.val=arr[i];
            temp=temp.next;
            temp.val=arr[j];
            temp=temp.next;
            i++;
            j--;
        }
    }
}