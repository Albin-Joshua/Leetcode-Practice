class Solution {
    public boolean isHappy(int n) {
        int slow = nextNumber(n);
        int fast = nextNumber(nextNumber(n));
        while(slow != fast){
            if(fast == 1) return true;
            slow = nextNumber(slow);
            fast = nextNumber(nextNumber(fast));
        }
        return slow == 1 ;
    }
    private int nextNumber(int n){
        int output = 0;
        while(n>0){
            int digit = n%10;
            output += digit*digit;
            n = n/10;
        }
        return output;
    }
}