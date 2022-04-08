class KthLargest {
    int k;
    PriorityQueue<Integer>pq;
    public KthLargest(int k, int[] nums) {
        
        this.k=k;
        this.pq=new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(i<k)
            {
                pq.add(nums[i]);
            }
            else if(pq.peek()<nums[i])
            {
                pq.remove();
                pq.add(nums[i]);
            }
        }
        
    }
    
    public int add(int val) {
        
        if(pq.size()<k)
        {
             pq.add(val);
        }
         else if(pq.peek()<val)
        {
            pq.remove();
            pq.add(val);
        }
        
        return pq.peek();
    }
}
