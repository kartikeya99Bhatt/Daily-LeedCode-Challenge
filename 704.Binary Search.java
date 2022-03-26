class Solution {
    public int search(int[] a, int target) {
        
        int lo=0;
        int hi=a.length-1;
        int idx=-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(a[mid]==target)
            {
                idx= mid;
                break;
            }
            else if(a[mid]<target)
            {
                lo=mid+1;
            }
            else
            {
                hi=mid-1;
            }
        }
        return idx;
    }
}
