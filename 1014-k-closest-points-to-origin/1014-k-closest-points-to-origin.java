class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> (x[0]*x[0]+x[1]*x[1]) - (y[0]*y[0]+y[1]*y[1]));
        for(int[] arr: points){
            pq.offer(arr);
        }
        int i=0;
        while(i<k){
            int[] temp = pq.poll();
            result[i][0] = temp[0];
            result[i][1] = temp[1];
            i++;
        }
        return result;
    }
}