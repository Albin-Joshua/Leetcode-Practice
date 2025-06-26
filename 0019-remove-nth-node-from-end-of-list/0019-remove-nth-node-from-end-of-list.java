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
        ListNode ptr = head;
        int c=0;
        while(ptr != null){
            c++;
            ptr = ptr.next;
        }
        int count = c-n;
        if(count == 0){
            return head.next;
        }
        ptr = head;
        int i=1;
        while(i<count){
            ptr = ptr.next;
            i++;
        }
        ptr.next = ptr.next.next;
        return head;
    }
}