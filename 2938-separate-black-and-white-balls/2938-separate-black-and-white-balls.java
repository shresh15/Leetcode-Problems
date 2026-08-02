class Solution {
    public long minimumSteps(String s) {
        int c=0,l=0;
        long cnt=0;
        while(c<s.length()){
            if(s.charAt(c)=='0'){
                // swap
                cnt=cnt+(c-l);
                c++;
                l++;
            }
            else c++;

        }
        return cnt;
    }
}