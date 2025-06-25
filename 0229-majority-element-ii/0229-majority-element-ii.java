class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int[][] num = new int[2][2];
        for(int value:nums){
            boolean found = false;
            for(int j=0; j<2; j++){
                if(num[j][0]==value){
                    num[j][1]+=1;
                    found=true;
                    break;
                }
            }
            if(!found){
                for(int j=0; j<2; j++){
                    if(num[j][1]==0){
                        num[j][0]=value;
                        num[j][1]=1;
                        found = true;
                        break;
                    }
                }
            }
            if(!found){
                for(int j=0; j<2; j++){
                    num[j][1]--;
                }
            }
        }
        Set<Integer> ans = new HashSet<>();
        for(int[] val:num){
            int count=0;
            for(int elements:nums){
                if(val[0]==elements){
                    count++;
                }
            }
            if(count > n/3){
                ans.add(val[0]);
            }
        }
        return new ArrayList<>(ans);
    }
}