class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> values = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;

            int l = i+1;
            int r = nums.length - 1;
             while(l<r){
                if(nums[i] + nums[l] + nums[r] > 0){
                    r--;
                }
                else if(nums[i] + nums[l] + nums[r] < 0){
                    l++;
                }
                else{
                    values.add(Arrays.asList(nums[i] , nums[l] , nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
             }
        }
        return values;
    }
}