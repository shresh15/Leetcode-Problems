class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        int i=0;
        if(n==1 || n==2) return false;
        else{
            while(i<n-1 && arr[i]<arr[i+1]) // increasing
            i++;

             // Peak cannot be the first or last element
        if (i == 0 || i == n - 1) return false;

            while(i<n-1 && arr[i]> arr[i+1])
            i++;
       
       return i==n-1;
    
    }
}
}