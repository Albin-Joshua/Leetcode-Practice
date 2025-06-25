public class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       Map<Integer,Integer> hash = new HashMap<>();
       for(int i:nums){
        hash.put(i,hash.getOrDefault(i,0)+1);
       }
       List<Integer> bucket[] = new ArrayList[nums.length+1]; //array of list -- bucket[]
       for(int i=0;i<bucket.length;i++){
        bucket[i]= new ArrayList<>();
       }
       for(int i:hash.keySet()){
        bucket[hash.get(i)].add(i);
       }
       int res[] = new int[k];
       int idx=0;
       for(int i=bucket.length-1;i>=0;i--){
        for(int j:bucket[i]){
            res[idx++]=j;
            if(idx==k) return res;
        }
       }
       return res;
       
    }
}