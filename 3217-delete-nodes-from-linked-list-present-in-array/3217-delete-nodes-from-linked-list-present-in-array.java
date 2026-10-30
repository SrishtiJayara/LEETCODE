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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int[] arr=new int[count];
        int j=0;
        while(temp!=null ){
            if(!set.contains(temp.val)){
                arr[j]=temp.val;
                j++;
            }
            temp=temp.next;  
        }
       ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int i=0; i<j; i++){
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return dummy.next; 
    }
}