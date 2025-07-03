class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int j: nums){
            if(map.get(j)==1){
                return j;
            }
        }
        return -1;
    }
}