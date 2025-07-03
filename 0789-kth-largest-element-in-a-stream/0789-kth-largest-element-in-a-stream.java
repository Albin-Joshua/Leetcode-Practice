class KthLargest {
    int k;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i : nums){
            if(pq.size()<k){
                pq.add(i);
            }
            else{
                if(i>pq.peek()){
                    pq.offer(i); //add() and offer() method performs the same operation of adding element to the priorityqueue. So we can use any one of the function. There is one difference which is not useful for now. I just used for reference
                    pq.poll();
                }
            }
        }
    }
    
    public int add(int val) {
        if(pq.size()<k){
            pq.add(val);
        }
        else if(val>pq.peek()){
            pq.offer(val);
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */