class Solution {
    public int rob1(int[] nums) {
        // here we will not use dp, we will space optimse it
        int n=nums.length;
        if(n==1) return nums[0];
        int prev2=0;
        int prev1=nums[0];
        
        int ans=0;
        if(n==1) return nums[0];
        for(int i=2;i<n+1;i++){
            int pick=nums[i-1]+prev2;
            int nopick=0+prev1;

            ans=Math.max(pick,nopick);

            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
    public int rob(int nums[]){
        int n=nums.length;
        if(n==1) return nums[0];
        
        int nums1[]=new int[n-1];
        int nums2[]=new int[n-1];
        int i=0;
        int k=0,j=0;
       for(i=0;i<n;i++)
    {   if(i!=0)
          { nums1[k]=nums[i];
            k++; }
        
         if(i!=n-1){
            nums2[j]=nums[i];
            j++;
        }
    }
    return Math.max(rob1(nums1), rob1(nums2));
    }
}