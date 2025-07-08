class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int l=0;
        int r=people.length - 1;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                count++;
                l++;
                r--;
            }
            else{
                count++;
                r--;
            }
        }
        return count;

        // int m = Arrays.stream(people).max().getAsInt();
        // int[] count = new int[m+1];
        // for(int p:people){
        //     count[p]++;
        // }
        // int idx = 0, i=1;
        // while(idx<people.length){
        //     while(count[i]==0){
        //         i++;
        //     }
        //     people[idx] = i;
        //     idx++;
        //     count[i]--;
        // }
        // int l = 0;
        // int r = people.length - 1;
        // int result = 0;
        // while(l<=r){
        //     int remain = limit - people[r];
        //     r--;
        //     result++;
        //     if(l<=r && remain >= people[l]){
        //         l++;
        //     }
        // }
        // return result;
    }
}