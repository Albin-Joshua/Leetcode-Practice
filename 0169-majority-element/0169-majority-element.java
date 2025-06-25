class Solution {
    public int majorityElement(int[] nums) {
/*        if(nums.length <= 2){
            return nums[0];
        }
        Map<Integer, Integer> count = new HashMap<>();
        int result=0;
        int maxCount=0;
        for(int num : nums){
            count.put(num, count.getOrDefault(num,0)+1);
            if(count.get(num)>maxCount){
                result=num;
                maxCount = count.get(num);
            }
        }
        return result;*/

        int count=0;
        int value= Integer.MIN_VALUE;
        for(int num:nums){
            if(count == 0){
                value = num;
                count++;
            }
            else if(value==num){
                count++;
            }
            else{
                count--;
            }
        }
        return value;
    }
}

//Boyer Moore Algorithm