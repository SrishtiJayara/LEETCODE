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
    public int pairSum(ListNode head) {
        int i=0;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int[] arr=new int[count];
        temp=head;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        int max = 0;
        for (int j = 0; j < arr.length / 2; j++) {
            int sum = arr[j] + arr[arr.length - 1 - j];

            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}