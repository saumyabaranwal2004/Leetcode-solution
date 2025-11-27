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
    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) return null;

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int mid = size / 2;

        temp = head;
        ListNode prev = null;
        int idx = 0;

        while (temp != null && idx < mid) {
            prev = temp;
            temp = temp.next;
            idx++;
        }
        prev.next = temp.next;

        return head;
    }
}
