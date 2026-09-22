class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer>current=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        boolean seen[]=new boolean[nums.length];
        permutations(nums,seen,current,res);
        return res;

        
    }
    void permutations(int nums[], boolean seen[], List<Integer>current, List<List<Integer>>res){
// if i have reached the last index [1,2,2]
        if(current.size()== nums.length){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            // case 1:  if it is seen then skip
            if(seen[i]) continue;
            // case 2: if seen is false but the current element == previous then skip ( DUPLICATE CASE)
            if(i>0 && seen[i-1]==false && nums[i-1]==nums[i]) continue;

            // case 3: we need to include
            seen[i]=true;
            current.add(nums[i]);
            permutations(nums,seen,current,res);
            current.remove(current.size()-1);
            seen[i]=false;

        }
        
        
        
      
    }
}