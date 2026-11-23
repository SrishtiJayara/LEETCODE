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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count1=0;
        ListNode temp1=list1;
        while(temp1!=null){
            count1++;
            temp1=temp1.next;
        }
        int[] arr1=new int[count1];
        temp1=list1;
        int i=0;
        while(temp1!=null){
            arr1[i]=temp1.val;
            temp1=temp1.next;
            i++;
        }
        int count2=0;
        ListNode temp2=list2;
        while(temp2!=null){
            count2++;
            temp2=temp2.next;
        }
        int[] arr2=new int[count2];
        temp2=list2;
        int j=0;
        while(temp2!=null){
            arr2[j]=temp2.val;
            temp2=temp2.next;
            j++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int m=0;m<a;m++){
            list.add(arr1[m]);
        }
        for(int n=0;n<count2;n++){
            list.add(arr2[n]);
        }
        for(int o=b+1;o<count1;o++){
            list.add(arr1[o]);
        }
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for(int val : list) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return dummy.next;
    }
}