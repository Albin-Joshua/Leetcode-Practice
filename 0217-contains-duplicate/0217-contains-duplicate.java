class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> element = new HashSet<>();
        for(int i : nums){
            if(element.contains(i)){
                return true;
            }
            element.add(i);
        }
        return false;
    }
}