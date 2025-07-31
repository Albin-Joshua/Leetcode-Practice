class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length()-1;
        int bLen = b.length()-1;
        char carry = '0';
        StringBuilder result = new StringBuilder();
        while(aLen>=0 && bLen>=0){
            if(a.charAt(aLen)=='1' && b.charAt(bLen)=='1'){
                if(carry=='1'){
                    result.insert(0,'1');
                }
                else{
                    result.insert(0,'0');
                    carry = '1';
                }
            }
            else if((a.charAt(aLen)=='1' && b.charAt(bLen)=='0') || (a.charAt(aLen)=='0' && b.charAt(bLen)=='1')){
                if(carry=='0'){
                    result.insert(0,'1');
                }
                else{
                    result.insert(0,'0');
                    carry = '1';
                }
            }
            else{
                if(carry=='0'){
                    result.insert(0,'0');
                }
                else{
                    result.insert(0,'1');
                    carry = '0';
                }
            }
            aLen--;
            bLen--;
        }
        while(aLen>=0){
            if(a.charAt(aLen)=='1'){
                if(carry=='0'){
                    result.insert(0,'1');
                }
                else{
                    result.insert(0,'0');
                    carry = '1';
                }
            }
            else{
                if(carry=='0'){
                    result.insert(0,'0');
                }
                else{
                    result.insert(0,'1');
                    carry = '0';
                }
            }
            aLen--;
        }
        while(bLen>=0){
            if(b.charAt(bLen)=='1'){
                if(carry=='0'){
                    result.insert(0,'1');
                }
                else{
                    result.insert(0,'0');
                    carry = '1';
                }
            }
            else{
                if(carry=='0'){
                    result.insert(0,'0');
                }
                else{
                    result.insert(0,'1');
                    carry = '0';
                }
            }
            bLen--;
        }
        if(carry=='1') result.insert(0,'1');
        return result.toString();
    }
}