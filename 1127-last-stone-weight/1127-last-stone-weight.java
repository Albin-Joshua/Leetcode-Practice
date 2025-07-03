class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            pq.add(i);
        }
        int temp1;
        int temp2;
        int ans;
        while(pq.size()>1){
            temp1 = pq.poll();
            temp2 = pq.poll();
            ans = Math.abs(temp1-temp2);
            if(ans>0){
                pq.add(ans);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}