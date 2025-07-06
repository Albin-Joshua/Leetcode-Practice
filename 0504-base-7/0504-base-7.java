class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";

        int sign = 1;
        if(num<0) sign = -1;

        StringBuilder res = new StringBuilder();
        num = Math.abs(num);
        while(num != 0){
            int temp = num%7;
            res.insert(0,temp);
            num /= 7;
        }

        return sign==1 ? res.toString() : "-"+res.toString();
    }
}