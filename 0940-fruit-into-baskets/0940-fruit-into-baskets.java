class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int r=0;
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int size = fruits.length;
        while(r<size){
            map.put(fruits[r], map.getOrDefault(fruits[r],0)+1);
            r++;
            while(map.size()>2){
                map.put(fruits[l], map.get(fruits[l])-1);
                if(map.get(fruits[l])==0) map.remove(fruits[l]);
                l++;
            }
            result = Math.max(result, r-l);
        }
        return result;
    }
}