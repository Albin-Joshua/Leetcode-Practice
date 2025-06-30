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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        int[][] result = new int[m][n];
        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
                if(head!=null){
                    result[top][i] = head.val;
                    head=head.next;
                }
                else result[top][i] = -1;
            }
            top++;
            for(int j=top; j<=bottom; j++){
                if(head!=null){
                    result[j][right] = head.val;
                    head=head.next;
                }
                else result[j][right] = -1;
            }
            right--;
            if(top<=bottom){
                for(int k=right; k>=left; k--){
                    if(head!=null){
                        result[bottom][k] = head.val;
                        head=head.next;
                    }
                    else result[bottom][k] = -1;
                }
                bottom--;
            }
            if(left<=right){
                for(int l=bottom; l>=top; l--){
                    if(head!=null){
                        result[l][left] = head.val;
                        head=head.next;
                    }
                    else result[l][left] = -1;
                }
                left++;
            }
        }
        return result;
    }
}