class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // non overlapping concept -> if(startB < endA) : overlapped.  if(startB>=endA) -> non overlapping
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        int removed=0;
        int lastend=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<lastend) // overlapped
            {
                removed++;
            }
            else // non overlapping
            {
                lastend=intervals[i][1];
            }

        }
        return removed;
    }
}