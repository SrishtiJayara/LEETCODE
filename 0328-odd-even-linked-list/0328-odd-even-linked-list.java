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
    public ListNode oddEvenList(ListNode head) {
        int count=0;
        ListNode temp=head;

        while(temp!=null) {
            count++;
            temp=temp.next;
        }

        int[] arr=new int[count];
        temp=head;
        int i=0;

        while(temp!=null) {
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }

        int m=1;
int n=2;

while(n<arr.length) {
    for(int k=n; k>m; k--) {
        int temp1=arr[k];
        arr[k]=arr[k-1];
        arr[k-1]=temp1;
    }
    m++;
    n+=2;
}

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        for(int g=0;g<i;g++) {
            curr.next=new ListNode(arr[g]);
            curr=curr.next;
        }

        return dummy.next;
    }
}