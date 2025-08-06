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
        if(head.next==null || head.next.next==null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = slow.next;
        slow.next = null;
        Stack<ListNode> stack = new Stack<>();
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        ListNode start = head;
        while(!stack.isEmpty()){
            ListNode upcoming = start.next;
            ListNode temp = stack.pop();
            start.next = temp;
            temp.next = upcoming;
            start = upcoming;
        }
        return;
    }
}