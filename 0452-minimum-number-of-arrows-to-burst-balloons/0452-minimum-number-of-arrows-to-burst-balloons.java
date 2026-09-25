class Solution {
    public int findMinArrowShots(int[][] points) {
// if the intervals overlap, then we can burst them with a single arrow. But at which point ? it ts the interval of the 
// the xEnd of the first element
// [1,6] and [2,8] can be burst using 6
Arrays.sort(points, (a,b)->  (a[1]<=b[1]) ? -1 : 1);
int arrows=1;
int lastend=points[0][1]; // this is the arrow point
for(int i=1;i<points.length;i++){
    // if(points[i][0]<arrowpoint) condition for overlapping
    if(points[i][0] > lastend)// non overlapping
    {
        arrows++;
        lastend=points[i][1];
    }

}
return arrows;

        
    }
}