class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int size = nums.length;
        int n = 1 << size;
        for(int i=0; i<n; i++){
            List<Integer> subSet = new ArrayList<>();
            for(int j=0; j<size; j++){
                if( (i&(1<<j)) > 0){
                    subSet.add(nums[j]);
                }
            }
            result.add(subSet);
        }
        return result;
    }
}