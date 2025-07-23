class Solution {
    int result=0;
    public int subsetXORSum(int[] nums) {
        dfs(0, nums, new ArrayList<>());
        return result;
    }
    public void dfs(int i, int[] nums, List<Integer> subSet){
        int xor=0;
        for(int num:subSet){
            xor^= num;
        }
        result += xor;
        for(int j=i; j<nums.length; j++){
            subSet.add(nums[j]);
            dfs(j+1, nums, subSet);
            subSet.remove(subSet.size()-1);
        }
    }
}