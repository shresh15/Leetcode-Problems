class Solution {
    public void sortColors(int[] nums) {
        int i=0,s=0,e=nums.length-1;
        while(i<=e){
            if(nums[i]==0){
                swap(nums,i,s);
                s++;
                i++;
            }
            else if(nums[i]==2){
                swap(nums,i,e);
                //i++;
                e--;                               
            }
            else i++;
        }
        
    }
    public void swap(int[] nums,int i,int j){
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
}