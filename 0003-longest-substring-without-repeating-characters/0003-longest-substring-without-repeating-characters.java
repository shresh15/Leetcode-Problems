class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ws=0,we=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int maxlen=Integer.MIN_VALUE;
        while(we<n){
           char ch=s.charAt(we);
            if(map.containsKey(ch)&& map.get(ch)>=ws){
                //shrink: i have to remove the element which is more than once
                ws=map.get(ch)+1; // we have removed the character
            }
            //now put the new character
            map.put(ch,we); // by using window-end, we are putting characters
            maxlen=Math.max(maxlen,(we-ws+1));
            we++;
        }
        return(maxlen==Integer.MIN_VALUE)? 0:maxlen;
    }
}