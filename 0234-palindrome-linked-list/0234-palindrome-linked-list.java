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
    public boolean isPalindrome(ListNode head) {
        ListNode ptr = head;
        Stack<Integer> stack = new Stack<>();
        while(ptr != null){
            stack.push(ptr.val);
            ptr = ptr.next;
        }
        ptr = head;
        while(!stack.isEmpty()){
            if(stack.pop() != ptr.val){
                return false;
            }
            ptr = ptr.next;
        }
        return true;
    }
}