class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> maps = new HashMap();
        for(int i=0; i<nums.length; i++){
            int difference = target - nums[i];

            if(maps.containsKey(difference)){
                return new int[]{maps.get(difference),i};
            }
            maps.put(nums[i],i);
        }
        return null;
    }
}