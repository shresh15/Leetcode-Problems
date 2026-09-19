class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        permutations(nums,current,res);
        return res;
    }
    void permutations(int nums[],List<Integer>current,List<List<Integer>>res){
        //base case
        if(current.size()==nums.length){
            res.add(new ArrayList<>(current));
            return;
        }

        //Then we do a loop. if present, then continue
        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])) continue;

            //include
            current.add(nums[i]);
            permutations(nums,current,res);
            // remove
            current.remove(current.size()-1);
        }
    }
}