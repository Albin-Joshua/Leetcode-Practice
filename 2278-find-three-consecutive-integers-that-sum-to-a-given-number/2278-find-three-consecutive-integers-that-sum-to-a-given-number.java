class Solution {
    public long[] sumOfThree(long num) {
        if(num%3 != 0){
            return new long[0];
        }
        long mid = num/3;
        long[] result = new long[3];
        result[0] = mid-1;
        result[1] = mid;
        result[2] = mid+1;
        long sum = 0;
        for(int i=0; i<3; i++){
            sum += result[i];
        }
        if(sum == num){
            return result;
        }
        else{
            return new long[0];
        }
    }
}