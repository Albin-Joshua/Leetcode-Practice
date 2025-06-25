class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> has = new HashSet<>();
        for(int num : nums){
            if(has.contains(num)){
                return true;
            }
            has.add(num);
        }
        return false;
    }
}