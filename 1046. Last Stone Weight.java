class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int val:stones)
        {
            pq.add(val);
        }
        
        while(pq.size()>1)
        {
           int val1=pq.remove();
           int val2=pq.remove();
           int ans=val1-val2;
            if(ans>0)
            {
                pq.add(ans);
            }
        }
        return (pq.size()==0 ? 0 : pq.remove());
        
    }
}
