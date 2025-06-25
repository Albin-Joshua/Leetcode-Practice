class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n1 = firstList.length;
        int n2 = secondList.length;
        if(n1==0 || n2==0) return new int[0][0];
        List<int[]> ans = new ArrayList<>();
        int startMax = 0;
        int endMin = 0;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            startMax = Math.max(firstList[i][0], secondList[j][0]);
            endMin = Math.min(firstList[i][1], secondList[j][1]);
            if(startMax<=endMin){
                ans.add(new int[]{startMax, endMin});
            }
            if(endMin == firstList[i][1]) i++;
            if(endMin == secondList[j][1]) j++;
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}