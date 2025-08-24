class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count =0;
        while(temp>0){
            int lastDigit = temp%10;
            if(num%lastDigit == 0) count++;
            temp /= 10;
        }
        return count;
    }
}