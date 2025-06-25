class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n>1){
            ArrayList<Integer> newNums = new ArrayList<>();
            for(int i=0;i<n/2;i++){
                if (i%2==0){
                    if(nums[2*i]<nums[2*i+1]){
                        newNums.add(nums[2*i]);
                    }
                    else{
                        newNums.add(nums[2*i+1]);
                    }
                }
                else{
                    if(nums[2*i]>nums[2*i+1]){
                        newNums.add(nums[2*i]);
                    }
                    else{
                        newNums.add(nums[2*i+1]);
                    }
                }
            }
            nums = new int[newNums.size()];
            for(int i=0; i<newNums.size(); i++){
                nums[i] = newNums.get(i);
            }
            n=newNums.size();
        }
        return nums[0];
        
    }
}