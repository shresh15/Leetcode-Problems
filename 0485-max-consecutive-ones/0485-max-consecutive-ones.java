class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int cnt=0, maxc=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==1){
                cnt++;
                maxc=Math.max(maxc,cnt);
            }
            else cnt=0;
        i++;
        }
        return maxc;

    }
}