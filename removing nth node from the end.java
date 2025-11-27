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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode ptr=head;
         ListNode temp2=null;
        while(ptr!=null){
            size++;
            ptr=ptr.next;
        }
        int m=size-n+1;;
        if(m<=0){
            System.out.println("invalid index");
        }
        ListNode temp=head;
        int idx=0;
       
        while(temp!=null && idx<m-1){
            temp2=temp;
            temp=temp.next;
            idx++;
        }
        if(temp==null){
            System.out.println("invslid index");
        }
        if (temp2 == null) {
    return head.next;   
}
    temp2.next=temp.next;
return head;
    }
}
