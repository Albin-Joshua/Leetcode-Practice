class Solution {
    public int addDigits(int num) {
        while(num>9){
            int value = 0;
            String s = Integer.toString(num);
            for(int i=0; i<s.length(); i++){
                int temp = num%10;
                value += temp;
                num /= 10;
            }
            num = value;
        }
        return num;
    }
}