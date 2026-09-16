class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>current = new ArrayList<>();

        subsequences(0, nums,current,res); // 0 is the starting index
        return res;
    }
        void subsequences(int index, int[]nums, List<Integer>current, List<List<Integer>>res){
            if(index==nums.length){
                res.add(new ArrayList<>(current));
                return;
            }
            // INCLUDE
            current.add(nums[index]); // including a particular element in the current array
            // pick
            subsequences(index+1,nums,current,res);

            // remove
            current.remove(current.size()-1);
            // no pick
            subsequences(index+1,nums,current,res);
        }

    
}