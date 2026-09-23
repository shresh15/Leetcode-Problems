class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String>mpp=new HashMap<>();
        mpp.put('2',"abc");
        mpp.put('3',"def");
        mpp.put('4',"ghi");
        mpp.put('5',"jkl");
        mpp.put('6',"mno");
        mpp.put('7',"pqrs");
        mpp.put('8',"tuv");
        mpp.put('9',"wxyz");
        List<String> res=new ArrayList<>();
        combinations(0,digits, mpp, new StringBuilder(""),res);
        return res;
    }

    void combinations(int index,String digits, HashMap<Character,String> mpp, StringBuilder current,List<String> res){
        if(index==digits.length()){
            res.add(current.toString());
            return;
        }
        // "23" first get 2 
        char dig=digits.charAt(index); // 2 (index=0)
        String letters=mpp.get(dig); // abc

        for(int i=0;i<letters.length();i++){ // traversing the letters assigned for a particular number
            current.append(letters.charAt(i));  // adding the letter to the string via stringbuilder
            combinations(index+1,digits,mpp,current,res);
            current.deleteCharAt(current.length()-1);
        }

    }
}