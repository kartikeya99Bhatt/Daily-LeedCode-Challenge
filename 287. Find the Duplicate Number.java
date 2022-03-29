 // APPROCH 1 (USING BINARY SEARCH  T(n)=nlog(n)  and CONSTANT SPACE ) 

class Solution {
    public int findDuplicate(int[] nums) {
        
        int low=1;
        int high=nums.length-1;
        int dublicate=-1;
        
        // Why high is nums.length-1 => n+1=nums.length => n=nums.length-1
        
        while(low<=high)
        {
            int count=0;
            int mid=(low+high)/2;
            
            for(int val:nums)
            {
                if(val<=mid)
                {
                    count++;
                }
            }
            
            if(count>mid) // 1 <=count ma hi h dublicate
            {
              dublicate=mid;
              high=mid-1;  
            }
            else  // count > ma hi h dublicate
            {
                low=mid+1;
            }
        }
        
        return dublicate;
    }
}


// APPROCH 2( USING "Floyd's Tortoise"  T(n)=n  Constant space )
class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow=nums[0];
        int fast=nums[nums[0]];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        
          fast=0;  
        while(slow!=fast)
        {
            fast=nums[fast];
            slow=nums[slow];
        }
        return slow;
    }
}
