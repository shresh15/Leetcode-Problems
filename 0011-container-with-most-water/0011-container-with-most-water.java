class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
        int area=0;
        while (i<j){
            area= (j-i)*(int)Math.min(height[i],height[j]);
            max=(int)(Math.max(max,area));
            if(height[i]<height[j]) i++;
            else j--;

        }
        return max;
    }
}